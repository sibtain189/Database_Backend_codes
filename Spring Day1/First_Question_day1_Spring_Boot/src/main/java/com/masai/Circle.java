package com.masai;

public class Circle {

	private int c;

	public Circle(int c) {
		super();
		this.c = c;
	}


	public void draw() {
		
		double res =2*3.17*c*c;
		System.out.println("You have drawn Circle "+res);
	}

	
}
