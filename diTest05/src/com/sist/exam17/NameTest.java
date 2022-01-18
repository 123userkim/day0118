package com.sist.exam17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NameTest {
	public static void main(String[] args) {
		 ApplicationContext context 
		 = new ClassPathXmlApplicationContext("com/sist/exam17/beans17.xml");
		 
		 
	  	 Person hong1  =(Person) context.getBean("hong");
		 Person hong2  =(Person) context.getBean("hong");
		 if(hong1==hong2) {
			 System.out.println("서로 같은 메모리를 바라봅니다");
		 }else {
			 System.out.println("서로 다른 메모리를 바라봅니다");			 
		 }
	 
		 //객체를 한 개 만들어서 사용함: 싱글톤 방식(scpoe이 bean생성시 숨겨짐 :  defalut가 싱글톤)
		 //prototype으로 만들면, 요청할 때마다 객체 하나가 생김
		 
	}
}
