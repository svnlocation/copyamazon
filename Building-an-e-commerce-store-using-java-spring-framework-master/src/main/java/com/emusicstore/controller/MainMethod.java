package com.emusicstore.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

	public static void main(String[] args) {
		ApplicationContext ctx=(ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");
		SingletonClassTest sn=(SingletonClassTest) ctx.getBean("singletonClassTestId");
	//	sn.demoMethod();
		System.out.println(sn.hashCode());
		SingletonClassTest sn1=(SingletonClassTest) ctx.getBean("singletonClassTestId");
		//sn1.demoMethod();
		System.out.println(sn1.hashCode());
	}
}