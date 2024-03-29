package com.kn.queue;

import java.util.Scanner;

public class QueueDS {

	private int[] q;
	private int size;
	private int r = -1;
	private int f = 0;

	private Scanner scan = new Scanner(System.in);

	public QueueDS(int n) {
		q = new int[n];
		size = q.length;
	}

	public void insert() {
		int elem;
		if (r == size - 1) {
			System.out.println("Insertion not possible");
		} else {
			System.out.println("Enter the element: ");
			elem = scan.nextInt();
			++r;
			q[r] = elem;
		}
	}

	public void delete() {
		if (r == -1 || f > r) {
			System.out.println("Deletion not possible");
		} else {
			System.out.println("The element deleted is " + q[f]);
			++f;
		}
	}

	public void display() {
		if (r == -1 || f > r) {
			System.out.println("Display not possible");
		} else {
			for (int i = f; i <= r; i++) {
				System.out.print(q[i] + " ");
			}
			System.out.println();
		}
	}

}
