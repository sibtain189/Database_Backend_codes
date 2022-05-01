package com.masai;

public class Square {

	private int s ;



	public void setS(int s) {
		this.s = s;
	}



	public void draw() {
		long res = s*s;
		System.out.println("You have drawn Square "+res);
	}
	
	
}
