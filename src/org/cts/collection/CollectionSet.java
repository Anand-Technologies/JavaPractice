package org.cts.collection;

import java.util.*;

public class CollectionSet {
	
	public static void main (String [] args) {
		
		
		
		
		List<Integer> se = new ArrayList<>();
		se.add(10);
		se.add(30);
		se.add(50);
		se.add(70);
		se.add(90);
		se.add(10);
		se.add(50);
		
		System.out.println(se);
		
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(se);
		
		System.out.println(set);
		
		System.out.println(se.size()-set.size());
		
		
		
		
	}

}
