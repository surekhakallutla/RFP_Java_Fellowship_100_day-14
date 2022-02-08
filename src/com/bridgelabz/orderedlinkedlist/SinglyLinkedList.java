package com.bridgelabz.orderedlinkedlist;

import java.util.LinkedList;

public class SinglyLinkedList {
	
	public static void main(String[] args) {
		LinkedListController list = new LinkedListController();
		
//		list.addNode(56);
//		list.addNode(30);
		list.addNode(70);
		list.addAtFront(new Node(30));
		list.addAtFront(new Node(56));
				
		list.display();
	}

}
