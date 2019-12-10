package com.example.exception;

public class TryCatchBasic {

	public static void main(String[] args) {
	
		try {
			System.out.println("Divide: " + divide(30, 6));
			//System.out.println("Divide: " + divide(30, 0));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			System.out.println("I will always be executed whether exception has been raised or not!");
		}
		
		System.out.println("Outside try catch! with error");

	}
	
	public static double divide(int a, int b) {
		return a/b;
	}

}
