package com.diamond.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTestDrive {

	public static void main(String[] args) {
		ReflectionTest t = new ReflectionTest();
		Class<?> clazz = t.getClass();
		String className=clazz.getSimpleName();
		Constructor<?>[] constructors=clazz.getConstructors();
		Method []m=clazz.getDeclaredMethods();
		
		for(Method m1:m) {
			System.out.println("Method names inside "+className +" are : "+m1);
			System.out.println("------------------");
			System.out.println("Return type : " + m1.getReturnType());
			System.out.println("Method modifier's name is : " +m1.getModifiers());
			
		}
		
		for(Constructor c:constructors) {
			System.out.println("Name of the constructor : " +c.getName());
		}
	}

}