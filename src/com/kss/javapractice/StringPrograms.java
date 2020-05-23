package com.kss.javapractice;

public class StringPrograms {
	public static void main(String[] args) {

		String s = "Hello To Java World";
		String full = "";
		String rev = "";
		String[] split = s.split(" ");

		for (int j = 0; j < split.length; j++) {
			String s1 = split[j];

			for (int i = s1.length() - 1; i >= 0; i--) {
				char charAt = s1.charAt(i);
				rev = rev + charAt;
				full = full + rev + " ";

				try {
					System.out.println(4 / 0);
					try {
						String s9= "string";
							System.out.println(s9.charAt(9));
					} catch (NullPointerException e) {
						System.out.println("Inner Catch 1");
					} catch (Exception e) {
						System.out.println("Inner catch 2");
					} finally {
						System.out.println("Inner finally 1");
					}

				} catch (ArithmeticException e) {
					System.out.println("Outer Catch 1");
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Outer catch 2");
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Outer catch 3");
				} finally {
					System.out.println("Outer finally 1");
				}

			}
		}
		System.out.println(full);

		// ==================================================================

		String x = "hello to java world";
		String sub = "";
		String fill = "";
		String[] split2 = x.split(" ");
		for (int i = 0; i < split2.length; i++) {

			String string = split2[i];
			char charAt = string.charAt(0);
			String substring = string.substring(1);
			sub = sub + Character.toUpperCase(charAt) + substring + " ";

		}
		System.out.println(sub);
	}
}
