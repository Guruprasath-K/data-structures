package com.kn.stack;

import java.util.Scanner;

public class StackDSDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter stack size:");
		int n = scan.nextInt();
		StackDS stack = new StackDS(n);
		while (true) {
			System.out.println("Enter 1 ----> PUSH");
			System.out.println("Enter 2 ----> POP");
			System.out.println("Enter 3 ----> DISPLAY");
			System.out.println("Enter any other number to exit");
			System.out.println("Enter your choice::::");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				stack.push();
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				stack.display();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
