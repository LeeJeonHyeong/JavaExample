package com.javalec.childern;

import com.javalec.papa.PapaPouch;

public class ThirdChild {
	
	public ThirdChild() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeMoney (int money) {
		
		PapaPouch.money = PapaPouch.money - money;
		if (PapaPouch.money < 0 ) System.out.println("셋째는 돈이 없어 못 받았어요 ㅜㅜ");
	}

}
