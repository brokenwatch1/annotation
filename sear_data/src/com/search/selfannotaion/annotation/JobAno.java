package com.search.selfannotaion.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JobAno {
	
	public String paramfiled();

	public String targetfiled();
	
	public String methodName();
	
	public Class beanClass();
}
