package com.sist.exam08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/sist/exam08/beans08.xml");
		GoodsVO g= 	(GoodsVO)context.getBean("goodsVo");
		g.info();
	}
}
