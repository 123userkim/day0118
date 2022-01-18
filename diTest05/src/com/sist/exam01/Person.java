package com.sist.exam01;

public class Person {
	private String name;
	private int age;
	 
	public Person() {
		System.out.println("생성자 동작함");
	}
	//xml은 무조건 기본생성자를 요구함
	 
	
	public Person(String name,int age) {
		this.name =name;
		this.age =age;
		System.out.println("매개변수를 갖는 생성자 동작함");
	}
	//자바가 매개변수를 갖는 생성자를 만들면 자바가 더이상 기본생성자 제공x
	
	
	public void sayHello() {
		System.out.println("Hello"+name);
		System.out.println("나이 :"+age);
	}
}
