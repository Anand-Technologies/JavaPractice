package org.cts.collection;

import java.util.*;

public class CollectionList {

	public static void main(String[] args) {

		List<Integer> lis = new ArrayList<>();
		lis.add(10);
		lis.add(30);
		lis.add(50);
		lis.add(70);
		lis.add(90);

		System.out.println("Initial values in list :" + lis);

		int size = lis.size();
		System.out.println(size);

		try {
			Integer integer = lis.get(8);
			System.out.println(integer);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		Integer integer2 = lis.get(3);
		System.out.println(integer2);

		lis.add(2, 40);
		System.out.println(lis);

		lis.add(4, 60);
		System.out.println(lis);

		lis.set(2, 100);
		System.out.println(lis);

		boolean contains = lis.contains(100);
		System.out.println(contains);

		lis.remove(2);
		System.out.println(lis);
		
		int indexOf = lis.indexOf(90);
		System.out.println(indexOf);
		
		int indexOf1 = lis.indexOf(120);
		System.out.println(indexOf1);
		
		int lastIndexOf = lis.lastIndexOf(60);
		System.out.println(lastIndexOf);
		
		List<Integer> sit = new ArrayList<>();
		sit.addAll(lis);
		sit.add(110);
		sit.add(130);
		sit.add(150);
		System.out.println(sit);
		
		//sit.retainAll(lis);
		//System.out.println(sit);
		
		//sit.removeAll(lis);
		//System.out.println(sit);
		
		for(int i=0; i< sit.size(); i++) {
			System.out.print(sit.get(i));
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
