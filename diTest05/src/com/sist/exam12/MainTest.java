package com.sist.exam12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		
		ApplicationContext context =
					new ClassPathXmlApplicationContext("com/sist/exam12/beans12.xml");
		
		SysteMoniter systeMoniter =(SysteMoniter) context.getBean("SysteMoniter");
		systeMoniter.monitor();
	}
}
