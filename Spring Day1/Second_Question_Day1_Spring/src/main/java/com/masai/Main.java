package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Presentation_Layer pl = app.getBean(Presentation_Layer.class,"sl");
		
		pl.res();

	}

}
