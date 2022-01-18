package com.sist.exam10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/sist/exam10/bean10.xml");
		OrderGoods g= 	(OrderGoods)context.getBean("OrderGoods");
		g.order();
	}
}
