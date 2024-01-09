package com.kn.queue;

import java.util.Scanner;

public class QueueDSDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Queue size:");
		int n = scan.nextInt();

		QueueDS queue = new QueueDS(n);
		while (true) {
			System.out.println("Press 1 ----> Insert");
			System.out.println("Press 2 ----> Delete");
			System.out.println("Press 3 ----> Display");
			System.out.println("Press any other number ----> Stop");
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				queue.insert();
				break;
			case 2:
				queue.delete();
				break;
			case 3:
				queue.display();
				break;
			default:
				System.exit(0);
			}
		}

	}

}
