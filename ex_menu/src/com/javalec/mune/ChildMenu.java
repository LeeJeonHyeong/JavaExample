package com.javalec.mune;

public class ChildMenu extends ParentMenu {

	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void makeBeefChungGukJang() {
		System.out.println("쇠고기 청국장");
	}
	
	public void makeHotDoenJangGuk() {
		System.out.println("얼큰 된장국");
	}
	
	public void makeKongNaMool() {
		System.out.println("콩나물 국");
	}
	
	public void makeChungGukJang() { // 오버라이딩 : 부모클래스의 메서드를 재정의
		System.out.println("냄새 없는 청국장");
	}
}
