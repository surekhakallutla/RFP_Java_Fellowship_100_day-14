package com.bridgelabz.orderedlinkedlist;

import java.util.LinkedList;

public class SinglyLinkedList {
	
	public static void main(String[] args) {
		LinkedListController list = new LinkedListController();
/*		
		list.addNode(56);
		list.addNode(30);
		list.addNode(70);
		
		list.addNode(70);
		list.addNodeAtFront(new Node(30));
		list.addNodeAtFront(new Node(56));
*/
		list.addNode(56);
		list.addNodeAtEnd(new Node(30));
		list.addNodeAtEnd(new Node(70));
		
		
		list.display();
	}

}
