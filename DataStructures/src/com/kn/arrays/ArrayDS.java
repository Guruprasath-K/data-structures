package com.kn.arrays;

import java.util.Scanner;

public class ArrayDS {

	private int[] arr;

	private Scanner scan = new Scanner(System.in);

	public ArrayDS(int n) {
		arr = new int[n];
	}

	public void insert() {
		System.out.println("Enter the position to insert element from 0 to " + (arr.length - 1));
		int pos = scan.nextInt();
		System.out.println("Enter the element:");
		int elem = scan.nextInt();
		arr[pos] = elem;
	}

	public void delete() {
		System.out.println("Enter the position to delete the element from 0 to " + (arr.length - 1));
		int pos = scan.nextInt();
		System.out.println("Element deleted is " + arr[pos]);
		arr[pos] = 0;
	}

	public void display() {
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
