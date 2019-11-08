package com.basic.polymorphism.child;

import com.basic.polymorphism.parent.Animal;


public class Lion extends Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Lion Sound: ROAR....");
	}

	@Override
	public void walks() {
		// TODO Auto-generated method stub
		System.out.println("Lion walks....");
	}
	
	
	public void eat() {
		System.out.println("Eat food...");
	}
	
	public void eat(String food) {
		System.out.println("Eat food... " + food);
	}
	
	public void eat(String food, String location) {
		System.out.println("Eat food... " + food + " at "  + location );
	}
	
	public void add() {
		
	}
	
	public void add(int n1, int n2) {
		
	}

	public void add(int n1, int n2, int n3) {
		
	}
	
	public void add(int[] nall) {
		
	}
}