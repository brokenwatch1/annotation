package com.search.selfannotaion.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

import com.search.selfannotaion.annotation.aopAfter;
import com.search.selfannotaion.utils.BeanUtils;

public class ProxyClass implements InvocationHandler {
	
	private Object target;
	
	public Object bind(Object target){
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	

	@SuppressWarnings("rawtypes")
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object invoke = method.invoke(target, args);
		if(method.getAnnotation(aopAfter.class) != null){
			BeanUtils.setJob((Collection) invoke);
		}
		return invoke;
	}

}
