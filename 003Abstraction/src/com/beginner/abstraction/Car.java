package com.beginner.abstraction;

public abstract  class Car {
	
	/**
	 * Abstraction -Approach using which only necessary details are exposed to the user/developer 
	 * @return 
	 */

	
	 public void accelerate() {
		 System.out.println("Accelerate...general....");
	 }
	 
	 abstract void drive();
	
}


