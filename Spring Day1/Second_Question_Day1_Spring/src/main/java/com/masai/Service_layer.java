package com.masai;

public class Service_layer {

	private int num1,num2;

	public Service_layer(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public void sum() {
		System.out.println("sum of two num is :"+(num1+num2));
	}
	
	public void subs() {
		System.out.println("sum of two num is :"+(num2-num1));
	}
	
	public void multi() {
		System.out.println("sum of two num is :"+(num1*num2));
	}
	
	public void div() {
		System.out.println("sum of two num is :"+(num2/num1));
	}
	
}
