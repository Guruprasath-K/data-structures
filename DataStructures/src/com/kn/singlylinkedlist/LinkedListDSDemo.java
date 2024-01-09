package com.kn.singlylinkedlist;

import java.util.Scanner;

public class LinkedListDSDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		LinkedListDS ll = new LinkedListDS();
		while (true) {
			System.out.println("Press 1-----> Insert Rear");
			System.out.println("Press 2-----> Delete Rear");
			System.out.println("Press 3-----> Insert Front");
			System.out.println("Press 4-----> Delete Front");
			System.out.println("Press 5-----> Display");
			System.out.println("Press any other number-----> Stop");
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				ll.insertRear();
				break;
			case 2:
				ll.deleteRear();
				break;
			case 3:
				ll.insertFront();
				break;
			case 4:
				ll.deleteFront();
				break;
			case 5:
				ll.display();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
