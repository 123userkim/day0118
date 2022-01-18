package com.sist.exam15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		
		ApplicationContext context =
					new ClassPathXmlApplicationContext("com/sist/exam15/beans15.xml");
		
		OrderGoods orderGoods =(OrderGoods) context.getBean("OrderGoods");
		orderGoods.order();
	}
}
