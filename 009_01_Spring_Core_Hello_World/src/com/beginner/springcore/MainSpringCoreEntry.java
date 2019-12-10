package com.beginner.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringCoreEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//non-spring core way or Java way
		/*
		 * Welcome w = new Welcome();
		 * w.setMessage("Hello from NON-Spring Core way!!!!");
		 * System.out.println(w.getMessage());
		 */
		
		//spring core way
		ApplicationContext handleToSpringContainer = new ClassPathXmlApplicationContext("beans.xml");
		Welcome welcome =   (Welcome) handleToSpringContainer.getBean("welcomeBean");
		System.out.println(welcome.getMessage());
		
		Community community = (Community) handleToSpringContainer.getBean("communityBean");
		System.out.println(community.getMembers() + " from location " + community.getLocation());
		
		
		
	}

}
