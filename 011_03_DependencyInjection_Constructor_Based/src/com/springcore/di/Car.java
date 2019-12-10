package com.springcore.di;

public class Car {

	private CarService carService;
	
	public Car(CarService carService) {
		System.out.println("Car constructor called!");
		this.carService = carService;
	}
	
	public void airFilterCheck() {
		carService.checkAirFilter();
	}
	
}
