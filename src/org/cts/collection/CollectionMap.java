package org.cts.collection;

import java.util.*;

public class CollectionMap {

	public static void main(String[] args) {

		Map<Integer, String> mp = new TreeMap<>();
		mp.put(20, "Testng");
		mp.put(10, "JAva");
		mp.put(30, "Selenium");
		mp.put(80, "CoreJava");
		mp.put(40, "Cucumber");

		System.out.println(mp);

		String string = mp.get(80);
		System.out.println(string);

		Set<Integer> string1 = mp.keySet();
		System.out.println(string1);

		Collection<String> string2 = mp.values();
		System.out.println(string2);

		boolean b = mp.containsKey(20);
		System.out.println(b);

		boolean c = mp.containsValue("Selenium");
		System.out.println(c);

	}

}
