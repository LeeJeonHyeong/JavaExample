package com.javalec.store;

public class StoreNum1 extends HeadQuarterStore {

	
	public StoreNum1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void orderKimChijjige() {
		// TODO Auto-generated method stub
		System.out.println("4,500원 입니다");
	}
	
	@Override
	public void orderBuDaejjige() {
		// TODO Auto-generated method stub
		System.out.println("5,000원 입니다");
	}
	
    @Override
    public void orderSunDaeguk() {
    	// TODO Auto-generated method stub
    	System.out.println("판매 하지 않습니다");
    }
	
}
