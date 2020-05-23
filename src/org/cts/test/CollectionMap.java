package org.cts.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CollectionMap {

	public static void main(String[] args) {
		Map<String, String> ba = new LinkedHashMap<String,String>();
		ba.put("Name", "Anand");
		ba.put("Domain", "Testing");
		ba.put("username","anand45");
		ba.put("pass", "qwerty123");
		
		System.out.println("Values in 1st MAP :"+ba);

		
		Map<String, String> ca = new LinkedHashMap<String, String>();
		ca.put("java","2222");
		ca.put("selenium", "3333");
		ca.put("testNG", "4444");
		ca.put("cucumber", "5555");
		
		System.out.println(ca);

		List<Map<String,String>> sa = new ArrayList<Map<String,String>>();
		sa.add(ba);
		sa.add(ca);
		
		System.out.println(sa);
		
	}

}
