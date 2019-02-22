package com.javalec.superex;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass childClass = new ChildClass();  // 자동적으로 ParentClass 생성자를 먼저 호출한다. 상속을 해줄 녀석이 먼저 생성된다
	 // childClass.method1();
	}
}
