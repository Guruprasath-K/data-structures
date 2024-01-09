package com.kn.doublylinkedlist;

import java.util.Scanner;

public class DoublyLinkedListDSDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DoublyLinkedListDS dll = new DoublyLinkedListDS();
		while (true) {
			System.out.println("Press 1-----> Insert Rear");
			System.out.println("Press 2-----> Delete Rear");
			System.out.println("Press 3-----> Insert Front");
			System.out.println("Press 4-----> Delete Front");
			System.out.println("Press 5-----> Display Forward");
			System.out.println("Press 6-----> Display Reverse");
			System.out.println("Press any other number-----> Stop");
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				dll.insertRear();
				break;
			case 2:
				dll.deleteRear();
				break;
			case 3:
				dll.insertFront();
				break;
			case 4:
				dll.deleteFront();
				break;
			case 5:
				dll.displayForward();
				break;
			case 6:
				dll.displayReverse();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
