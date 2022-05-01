package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Circle circle = application.getBean(Circle.class,"c");
		
	    circle.draw();
	    
	    Square sq = application.getBean(Square.class,"s");
	    
	    sq.draw();
	    
	    Traingle t = application.getBean(Traingle.class,"t");
	    
	    t.draw();
		
	}

}
