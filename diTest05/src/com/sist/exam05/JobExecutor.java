package com.sist.exam05;

public class JobExecutor {
	public JobExecutor(String name, int secondes) {
		System.out.println("������ ȣ��1");
	}
	 
	public JobExecutor(String name, long secondes) {
		System.out.println("������ ȣ��2");
	}
	
	public JobExecutor(String name, String secondes) {
		System.out.println("������ ȣ��3");
	}
	
	
 
	
	//�ߺ��Ǿ����� �� String�� �켱������ ����
	public void pro() {
		System.out.println("JobExecutor�� pro�Դϴ�.");
	}
}
