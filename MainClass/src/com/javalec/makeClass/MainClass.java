package com.javalec.makeClass;

public class MainClass { // Class의 첫글자는 대문자로 한다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManClass mc = new ManClass();
		ManClass mc1 = new ManClass(15, 160, 50, "010-1111-0000" );
		
		mc.getAge();	
		
		double d = mc.calcultaeBMI();
	}

}
