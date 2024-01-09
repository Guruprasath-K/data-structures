package com.kn.stack;

import java.util.Scanner;

public class StackDS {

	private int s[];
	private int size;
	private int top = -1;
	private Scanner scan = new Scanner(System.in);

	public StackDS(int n) {
		s = new int[n];
		size = s.length;
	}

	public void push() {
		int elem;
		if (top == size - 1) {
			System.out.println("PUSH not possible");
		} else {
			System.out.println("Enter an element:");
			elem = scan.nextInt();
			++top;
			s[top] = elem;
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("POP not possible");
		} else {
			System.out.println("Element deleted is " + s[top]);
			// s[top] = 0;
			--top;
		}
	}

	public void display() {
		if (top == -1) {
			System.out.println("DISPLAY not possible");
		} else {
			for (int i = top; i >= 0; i--) {
				System.out.println(s[i]);
			}
		}
	}
}
