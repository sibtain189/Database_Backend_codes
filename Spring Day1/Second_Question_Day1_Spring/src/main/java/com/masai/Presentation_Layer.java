package com.masai;

public class Presentation_Layer {

	
	private Service_layer sl ;


	public void setSl(Service_layer sl) {
		this.sl = sl;
	}
	
	public void res() {
		sl.sum();
		sl.subs();
		sl.multi();
		sl.div();
	}
	
}
