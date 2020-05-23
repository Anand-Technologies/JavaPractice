package org.cts.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {

		List li = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));

		List si = new ArrayList(Arrays.asList(01,02,03,04,05));
		
		List gi = new ArrayList(Arrays.asList(11,22,33,44,55));
		
		System.out.println("Values in LIST 1st :"+li);
		
		System.out.println("Values in LIST 2nd :"+si);
		
		System.out.println("Values in LIST 2nd :"+gi);
		
		List<List<Integer>> mi = new ArrayList<List<Integer>>();
		mi.add(li);
		mi.add(si);
		mi.add(gi);
		System.out.println("Three List Values in 4th LIST :"+mi);
		
	}
}
