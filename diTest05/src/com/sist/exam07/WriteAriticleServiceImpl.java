package com.sist.exam07;

public class WriteAriticleServiceImpl {
	private AriticleDao dao;

	public void setDao(AriticleDao dao) {
		this.dao = dao;
	}
	
	
	public void insert() {
		dao.insert();
	}
}	
