package com.javalec.childern;

import com.javalec.papa.PapaPouch;

public class FirstChild {

	public FirstChild() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeMoney(int money) {
		
		PapaPouch.money = PapaPouch.money - money ;
		if (PapaPouch.money < 0 ) System.out.println("ù°�� ���� ���� �� �޾Ҿ�� �̤�");
	}
}
