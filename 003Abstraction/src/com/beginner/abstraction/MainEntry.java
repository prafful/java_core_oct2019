package com.beginner.abstraction;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//car is abstract class so you cannot create instance of the same!
		//Car car = new  Car();
		//car.accelerate();
		
		//to access abstract class, it should be inherited first!
		Car suv = new SUV();
		suv.accelerate();
		suv.drive();
	}

}
