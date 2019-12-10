package com.example.gc;

public class GCMainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathematics m1 = new Mathematics();
		Mathematics m2 = new Mathematics();
		
		m1.setNumbers(4, 5);
		m2.setNumbers(8, 9);
		
		m1.showNumbers();
		m2.showNumbers();
		
		Mathematics m3;
		m3 = m2;
		m3.showNumbers();
		
		m2 = null;
		m3.showNumbers();
		
		//now m3 is not pointing to any location in heap so it can be garbage collected
		// i.e. removed from memory!
		m3=null;
		
		//m3.showNumbers();
		
		//int counter = 5;
		//System.out.println("Counter: " + counter);
		//cannot assign primitive object to null 
		//primitive - int, long, float, double, char, boolean, byte, short
		//counter = null;
		
				
		
	}

}
