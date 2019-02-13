package com.javalec.classimport;

import com.javalec.cal.*; // com.javalec.cal 패키지 안에 있는 모든 클래스를 import 한다
// import com.javalec.cal.PlusClass2;

public class MainClass {
	
	public static void main(String[] args) {
		PlusClass plusClass = new PlusClass();
		PlusClass2 plusClass2 = new PlusClass2();
		int result = plusClass,plus(3, 7);
		
		System.out.println(result);
	}

}
