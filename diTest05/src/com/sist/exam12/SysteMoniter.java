package com.sist.exam12;

public class SysteMoniter {
	private long periodTime;
	private SmsSender sender;
 
	public void setPeriodTime(long periodTime) {
		this.periodTime = periodTime;
	}

	public void setSender(SmsSender sender) {
		this.sender = sender;
	}

	public void monitor() {
		System.out.println(periodTime+ "분 간격으로");
		sender.send();
	}


}
