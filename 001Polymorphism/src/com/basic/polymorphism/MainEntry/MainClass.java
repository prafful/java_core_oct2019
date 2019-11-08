package com.basic.polymorphism.MainEntry;

import com.basic.polymorphism.child.Lion;
import com.basic.polymorphism.parent.Animal;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal(); 	//instance of type animal
		Animal lion = new Lion(); 		//instance of type lion
		Lion lion2 = new Lion();
		
		animal.makeSound();
		animal.walks();
		
		System.out.println("--------- Polymorphism -------------");
		
		lion.makeSound();
		lion.walks();
		
		System.out.println("--------- Method Overloading -------------");
		
		lion2.eat();
		lion2.eat("Something..");
		lion2.eat("someting ...", "forest");
		lion2.eat("someting ...", "zoo");
		


	}

}
