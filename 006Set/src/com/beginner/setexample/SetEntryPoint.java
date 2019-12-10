package com.beginner.setexample;

import java.util.HashSet;
import java.util.Set;

public class SetEntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashset = new HashSet<String>();
		
		hashset.add("OBB");
		hashset.add("KIA");
		hashset.add("PIA");
		hashset.add("OBB");
		hashset.add("KIA");
		
		System.out.println(hashset);
		
		
	}

}
