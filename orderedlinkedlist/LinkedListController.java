package com.bridgelabz.orderedlinkedlist;

public class LinkedListController {
		
	public static void addNode(int data) {
		
		Node newNode = new Node(data);
		
		if(LinkedList.head == null) {
			LinkedList.head = newNode;
			LinkedList.tail = newNode;
		}
		
		else {
			LinkedList.tail.next = newNode;
			LinkedList.tail = newNode;
		}
		
	}
	
	public static void display() {
		Node current = LinkedList.head;
		
		if(LinkedList.head == null) {
			System.out.println("Linked List is Empty");
			return;
		}
		
		System.out.println("Nodes of Singly Linked List :");
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		
		System.out.println();
	}
	
	public static void addNodeAtFront(Node newNode) {
		 Node temp = LinkedList.head;
		LinkedList.head = newNode;
		LinkedList.head.next = temp;	
	}
	
	public static void addNodeAtEnd(Node newNode) {
		if(LinkedList.head == null) {
			LinkedList.head = newNode; 
			LinkedList.head.next = null;
			LinkedList.tail = newNode;
		}
		
		else {
			Node temp = LinkedList.tail;
			temp.next = newNode;
			LinkedList.tail = newNode;
			LinkedList.tail.next = null;	
		}	
	}
	
	public static void addInMid(Node newNode) {
		if(LinkedList.head == null) {
			LinkedList.head = newNode; 
			LinkedList.head.next = null;
			LinkedList.tail = newNode;
		}
		
		else {
			LinkedList list = new LinkedList();
			int size = sizeOfList();
			int midPoint = size/2;
			if((size % 2 == 0) || (size + 1) %  2 == 0) {
				Node temp = list.head;
				Node current = null;
			}
			
		}	
	}
	
	public static void deleteFromFirst(Node node) {
		if(LinkedList.head == null) {
			System.out.println("List is Empty");
		}
		
		else {
			LinkedList.head = LinkedList.head.next;
		}
	}
	
	public static int sizeOfList() {
		int length = 0;
		Node temp = LinkedList.head;
		while(temp != null) {
			temp = temp.next;
			length++;
		}	
		return length;
	}
	
}
