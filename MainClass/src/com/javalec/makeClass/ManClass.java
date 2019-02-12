package com.javalec.makeClass;

public class ManClass {
	
	private int age;  // 인스턴스 변수 private이므로 MainClass에서 접근 불가
	private int height;
	private int weight;
	private String phoneNum;
	
	public ManClass() { // default 생성자 (파라미터 없는)
		
	}
	
	public ManClass(int age, int height, int weight, String phoneNum) {
		// 파라미터 있는 생성자
		this.age = age; // this는 객체 자기자신을 의미. ManClass의 age에 매개변수 age를 할당한다는 뜻
		this.height = height;
		this.weight = weight;
		this.phoneNum = phoneNum;
		
	}
	
	public double calcultaeBMI() { // 메서드
		
		double result = weight / (height * height);
		return result;
	}

	public int getAge() {  // public으로 설정되있기 때문에 MainClass에서 접근 가능
		return age;        // private로 바꾸면 MainClass에서 접근 불가
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
}
