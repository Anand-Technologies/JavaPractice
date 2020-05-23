package org.cts.test;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int n  = sc.nextInt();
		int a1 = 0 , a2 = 1 ;
		for(int i=0; i<= 10 ; i++) {
		int a3= a1+a2;
		System.out.println(a3);
		a1=a2;
		a2=a3;
		}		
	}
}
