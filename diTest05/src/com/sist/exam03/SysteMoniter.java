package com.sist.exam03;

public class SysteMoniter {
	private long periodTime;
	private SmsSender sender;
	public SysteMoniter(long periodTime, SmsSender sender) {
		super();
		this.periodTime = periodTime;
		this.sender = sender;
	}
	
	
	public void monitor() {
		System.out.println(periodTime+ "분 간격으로");
		sender.send();
	}


}
