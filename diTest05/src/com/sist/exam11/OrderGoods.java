package com.sist.exam11;

public class OrderGoods {
	private String customer;
	private GoodsVO goodsVO;
  
	public void setCustomer(String customer) {
		this.customer = customer;
	} 
	public void setGoodsVO(GoodsVO goodsVO) {
		this.goodsVO = goodsVO;
	}
 
	public void order() {
		System.out.println(customer + "고객이 구매한 상품의 정보는 다음과 같습니다.");
		goodsVO.info();
	}
}
