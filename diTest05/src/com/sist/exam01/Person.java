package com.sist.exam01;

public class Person {
	private String name;
	private int age;
	 
	public Person() {
		System.out.println("������ ������");
	}
	//xml�� ������ �⺻�����ڸ� �䱸��
	 
	
	public Person(String name,int age) {
		this.name =name;
		this.age =age;
		System.out.println("�Ű������� ���� ������ ������");
	}
	//�ڹٰ� �Ű������� ���� �����ڸ� ����� �ڹٰ� ���̻� �⺻������ ����x
	
	
	public void sayHello() {
		System.out.println("Hello"+name);
		System.out.println("���� :"+age);
	}
}
