package com.kss.javapractice;

import java.util.Scanner;

public class AscendingDescending {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number how many you want in Array :");
		int n = s.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the input number in array :");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Third largest value "+arr[n-4]);
		// int temp = 0;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the number how many you want in array :");
		// int count = sc.nextInt();
		// int num[] = new int[count];
		//
		// System.out.println("Enter the inputs in array :");
		// for (int i = 0; i < count; i++) {
		// num[i] = sc.nextInt();
		// }
		//
		// for (int i = 0; i < count; i++) {
		// for (int j = i + 1; j < count; j++) {
		//
		// if (num[i] > num[j]) {
		// temp = num[i];
		// num[i] = num[j];
		// num[j] = temp;
		// }
		// }
		// }
		//
		// for(int i=0;i<count;i++) {
		// System.out.println(num[i]);
		// }
		//
	}
}
