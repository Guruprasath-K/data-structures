package com.kn.circularqueue;

import java.util.Scanner;

public class CircularQueueDSDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Circular Queue size:");
		int n = scan.nextInt();

		CircularQueueDS circularQueue = new CircularQueueDS(n);
		while (true) {
			System.out.println("Press 1 ----> Insert");
			System.out.println("Press 2 ----> Delete");
			System.out.println("Press 3 ----> Display");
			System.out.println("Press any other number ----> Stop");
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				circularQueue.insert();
				break;
			case 2:
				circularQueue.delete();
				break;
			case 3:
				circularQueue.display();
				break;
			default:
				System.exit(0);
			}
		}

	}

}
