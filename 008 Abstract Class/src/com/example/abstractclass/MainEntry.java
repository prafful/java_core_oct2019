package com.example.abstractclass;

public class MainEntry extends Student{

	@Override
	void increaseScore() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of abstract method");
	}
	
	@Override
	void increaseScore(int score) {
		// TODO Auto-generated method stub
		System.out.println("Implementation of abstract method increase by: " + score);
	}
	
	public static void main(String args[]) {
		Student s = new MainEntry();
		s.increaseScore(8);
	}

	

}
