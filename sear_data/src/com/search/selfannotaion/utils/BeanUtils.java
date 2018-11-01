package com.search.selfannotaion.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;

import com.search.selfannotaion.annotation.JobAno;

public class BeanUtils {
	
	public static void setJob(Collection collection)throws Exception{
		if(collection == null){
			return;
		}
		//获取对象
		Class<? extends Object> clzz = collection.iterator().next().getClass();
		Field[] fields = clzz.getDeclaredFields();
		for(int i = 0; i < fields.length; i++){
			fields[i].setAccessible(true);
			JobAno annotation = fields[i].getAnnotation(JobAno.class);
			if(annotation == null){
				continue;
			}
			Class beanClass = annotation.beanClass();
			String methodName = annotation.methodName();
			String paramfiled = annotation.paramfiled();
			String targetfiled = annotation.targetfiled();
			Method declaredMethod = beanClass.getDeclaredMethod(methodName, clzz.getDeclaredField(paramfiled).getType());
			//获得入参字段
			Field paramField = clzz.getDeclaredField(paramfiled);
			paramField.setAccessible(true);
			
			Field targetField = null;
			//判断是否有参数
			boolean ineedFiled = annotation.targetfiled()== null||annotation.targetfiled().equals("")?false:true;
			
			for(Object obj : collection){
				Object paramValue = paramField.get(obj);
				if(paramValue == null){
					continue;
				}
				//方法返回对象
				Object invoke = declaredMethod.invoke(beanClass.newInstance(), paramValue);
				if(ineedFiled){
					if(invoke != null){
						targetField = invoke.getClass().getDeclaredField(annotation.targetfiled());
						targetField.setAccessible(true);
						invoke = targetField.get(invoke);
						fields[i].set(obj, invoke);
					}
				}
			}
		}
	}
}
