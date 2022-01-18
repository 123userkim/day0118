package com.sist.exam16;

public class WriteAriticleServiceImpl {
	private AriticleDao dao;
	
	public WriteAriticleServiceImpl(AriticleDao dao) {
		super();
		this.dao = dao;
	}

	public void insert() {
		dao.insert();
	}
}	
