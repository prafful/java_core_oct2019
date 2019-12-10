package com.beginner.arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> friends = new ArrayList<String>();
		
		ArrayList<Integer> score = new ArrayList<Integer>();
		
		friends.add("OBB");
		friends.add("KIA");
		friends.add("ML");
		
		System.out.println(friends);
		
		score.add(25);
		score.add(35);
		score.add(80);
		
		System.out.println(score);
		
		System.out.println(friends.size());
		friends.remove(0);
		System.out.println(friends);
		friends.add("MIA");
		friends.add("PIA");
		System.out.println(friends);
		System.out.println(friends.remove("KIA"));
		System.out.println(friends);
		System.out.println(friends.remove("KIA"));
		friends.remove("KIA");
		
		System.out.println(score);
		for (Integer s : score) {
			System.out.println(s+5);
		}
		
		
		
		
		
	}

}
