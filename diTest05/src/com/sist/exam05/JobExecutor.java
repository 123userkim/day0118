package com.sist.exam05;

public class JobExecutor {
	public JobExecutor(String name, int secondes) {
		System.out.println("생성자 호출1");
	}
	 
	public JobExecutor(String name, long secondes) {
		System.out.println("생성자 호출2");
	}
	
	public JobExecutor(String name, String secondes) {
		System.out.println("생성자 호출3");
	}
	
	
 
	
	//중복되어있을 때 String이 우선순위가 높음
	public void pro() {
		System.out.println("JobExecutor의 pro입니다.");
	}
}
