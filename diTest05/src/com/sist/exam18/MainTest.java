package com.sist.exam18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
	//	ApplicationContext context
	//	= new ClassPathXmlApplicationContext("com/sist/exam18/beans18.xml");
		/*
		Monitor monitor =(Monitor) context.getBean("monitor");
		monitor.start();
		*/
		AbstractApplicationContext context =
				new  ClassPathXmlApplicationContext("com/sist/exam18/beans18.xml");
		
		try {
			
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		
		context.close();
	}
}
