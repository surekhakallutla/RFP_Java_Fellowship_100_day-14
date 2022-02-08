package com.bridgelabz.linkedlistexample;

public class MyUnorderedLinkedList<Generic> {
	
	INode<Generic> head;
	INode<Generic> tail;
	
	public void add(INode<Generic> newNode) {
		if(head == null) {
			head = newNode;
		}
		
		else if(tail == null) {
			tail = newNode;
		}
		
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	public void displayNode() {
		System.out.println("My Nodes =" + head);
	}

	@Override
	public String toString() {
		return head.toString();
	}
	
	
	
}
