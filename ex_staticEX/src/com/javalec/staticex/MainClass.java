package com.javalec.staticex;

import com.javalec.childern.FirstChild;
import com.javalec.childern.SecondChild;
import com.javalec.childern.ThirdChild;

public class MainClass {

	public static void main(String[] args) {
		
		FirstChild firstChild = new FirstChild();
		firstChild.takeMoney(100);
		
		SecondChild secondChild = new SecondChild();
		secondChild.takeMoney(100);
		
		ThirdChild thirdChild = new ThirdChild();
		thirdChild.takeMoney(100);
		
	}
}
