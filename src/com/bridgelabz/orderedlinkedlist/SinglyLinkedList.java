package com.bridgelabz.orderedlinkedlist;

import java.util.LinkedList;

public class SinglyLinkedList {
	static LinkedListController list = new LinkedListController();
	
	public static void addNode(int data) {
		
		Node newNode = new Node(data);
		
		if(list.head == null) {
			list.head = newNode;
			list.tail = newNode;
		}
		
		else {
			list.tail.next = newNode;
			list.tail = newNode;
		}
		
	}
	
	public static void display() {
		Node current = list.head;
		
		if(list.head == null) {
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
		if(list.head == null) {
			list.head = newNode;
			list.tail = newNode;
		}
		else {
/*			
			Node temp = head;
			head = newNode;
			head.next = temp;
*/
			list.head.next = list.head;
			list.head = newNode;
		}
		list.add(newNode);	
	}
	
	public static void addNodeAtEnd(Node newNode) {
		if(list.head == null) {
			list.head = newNode; 
			list.tail = newNode;
		}
		
		else {
			list.tail.next = newNode;
			list.tail = newNode;
		}	
	}
	
	public static void addAtNthPosition(Node newNode) {
		if(list.head == null) {
			list.head = newNode; 
			list.tail = newNode;
		}
		
		else {
			int size = sizeOfList();
			int midPoint = size/2;
			if((size % 2 == 0) || (size + 1) %  2 == 0) {
				Node temp = list.head;
				Node current = null;
			}
			
		}	
	}
	
	public static void deleteFromFirst(Node node) {
		if(list.head == null) {
			System.out.println("List is Empty");
		}
		
		else {
			list.head = list.head.next;
		}
	}
	
	public static int sizeOfList() {
		int length = 0;
		Node temp = list.head;
		while(temp != null) {
			temp = temp.next;
			length++;
		}	
		return length;
	}
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
