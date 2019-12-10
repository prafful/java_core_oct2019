package com.beginner.mapexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> friends = new HashMap<Integer, String>();
		
		friends.put(1, "OBB");
		friends.put(2, "KIA");
		friends.put(4, "PIA");
		friends.put(8, "MIA");
		
		System.out.println(friends);
		
		Set friendsSet = friends.entrySet();
		Iterator iterator = friendsSet.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) iterator.next();
			System.out.println("Key: " + me.getKey()  + ", " + "Value: " + me.getValue() );
		}
		
		System.out.println("------------------- Using For ------------------");
		
		for(Map.Entry me: friends.entrySet()) {
			System.out.println("Key: " + me.getKey()  + ", " + "Value: " + me.getValue() );
		}
		

	}

}
