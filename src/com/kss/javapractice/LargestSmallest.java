package com.kss.javapractice;

import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {

		int max =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number you want in Array :");
		int n = s.nextInt();

		int num[] = new int[n];
		System.out.println("Enter the input number in Array :");
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}

		num[0] = max;
		for (int i = 0; i < n; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		
		System.out.println("Maximum :"+max);
//		for(int i=0; i<n; i++) {
//			System.out.println("Print all numbers :"+num[i]);
//		}
//		System.out.println(num[n-1]);
	}
}
