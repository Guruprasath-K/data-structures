package com.kn.arrays;

import java.util.Scanner;

public class ArrayDSDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length");
		int n = scan.nextInt();
		ArrayDS a = new ArrayDS(n);
		while (true) {
			System.out.println("Enter 1 ----> inserting");
			System.out.println("Enter 2 ----> deleting");
			System.out.println("Enter 3 ----> display");
			System.out.println("Enter any other number to exit");
			System.out.println("Enter your choice::::");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				a.insert();
				break;
			case 2:
				a.delete();
				break;
			case 3:
				a.display();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
