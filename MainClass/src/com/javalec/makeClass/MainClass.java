package com.javalec.makeClass;

public class MainClass { // Class�� ù���ڴ� �빮�ڷ� �Ѵ�.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManClass mc = new ManClass();
		ManClass mc1 = new ManClass(15, 160, 50, "010-1111-0000" );
		
		mc.getAge();	
		
		double d = mc.calcultaeBMI();
	}

}
