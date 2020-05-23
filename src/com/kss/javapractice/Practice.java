package com.kss.javapractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {
	public static void main(String[] args) {

		String s = "Tomorrow";
		int count = 0;
		String f = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			f = f + s.charAt(i);
		}
		System.out.println(f);

		// =================================================================

		String s1 = "EMIS Health india";
		char[] cs = s1.toCharArray();

		Map<Character, Integer> mp = new LinkedHashMap<>();

		for (Character c : cs) {
			if (mp.containsKey(c)) {
				if (c >= 'a' && c <= 'z') {
					break;
				}
				Integer integer = mp.get(c);
				mp.put(c, integer + 1);
			} else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);

		// =============================================================================================

		int acc[] = { 22, 77, 33, 99, 55, 11 };
		int max = 0;
		acc[0] = max;

		for (int i = 1; i <= acc.length - 1; i++) {

			if (acc[i] > max) {
				max = acc[i];
			}
		}

		System.out.println(max);

		// ===============================================================================================

		
		// System.out.println(arr[arr.length-1]);

		// for (int i = 0; i < s.length(); i++) {
		// char c = s.charAt(i);
		// String valueOf = String.valueOf(c);
		// if (count == 0) {
		// if (valueOf.equals("o")) {
		// f = s.replace("o", "x");
		// count++;
		// }
		// } else if (count == 1) {
		// if (valueOf.equals("o")) {
		// f = s.replace("o", "xx");
		// count++;
		// }
		// }
		// }
		// System.out.println(f);

		// char[] cs = s.toCharArray();
		// for (char c : cs) {
		// String valueOf = String.valueOf(c);
		// if (count == 0) {
		// String replace = s.replace("o", "x");
		// System.out.println(replace);
		// count++;
		//
		// }
		//
		// else if (count == 1) {
		// String replace = s.replace("o", "xx");
		// System.out.println(replace);
		// count++;
		// }
		// }

	}
}
