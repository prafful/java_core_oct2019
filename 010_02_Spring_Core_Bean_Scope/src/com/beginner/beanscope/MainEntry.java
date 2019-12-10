package com.beginner.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("settings.xml");
		Welcome w = (Welcome) context.getBean("welcomeBean");
		
		w.setMessage("Set in Main!");
		w.setLifespan(9);
		
		System.out.println("Message is : "  +  w.getMessage() + " with lifespan of " + w.getLifespan());
		
		
		Welcome w1 = (Welcome) context.getBean("welcomeBean");
		System.out.println("Message is : "  +  w1.getMessage() + " with lifespan of " + w1.getLifespan());
		

	}

}
