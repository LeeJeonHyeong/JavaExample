package com.javalec.makeClass;

public class ManClass {
	
	private int age;  // �ν��Ͻ� ���� private�̹Ƿ� MainClass���� ���� �Ұ�
	private int height;
	private int weight;
	private String phoneNum;
	
	public ManClass() { // default ������ (�Ķ���� ����)
		
	}
	
	public ManClass(int age, int height, int weight, String phoneNum) {
		// �Ķ���� �ִ� ������
		this.age = age; // this�� ��ü �ڱ��ڽ��� �ǹ�. ManClass�� age�� �Ű����� age�� �Ҵ��Ѵٴ� ��
		this.height = height;
		this.weight = weight;
		this.phoneNum = phoneNum;
		
	}
	
	public double calcultaeBMI() { // �޼���
		
		double result = weight / (height * height);
		return result;
	}

	public int getAge() {  // public���� �������ֱ� ������ MainClass���� ���� ����
		return age;        // private�� �ٲٸ� MainClass���� ���� �Ұ�
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
