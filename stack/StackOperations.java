package com.bridgelabz.stack;

public class StackOperations {
	Stack stack = new Stack();
	
	public boolean isFull() {
		return stack.top > stack.size-1;
	}
	
	public boolean isEmpty() {
		return stack.top <= -1;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		
		else {
			stack.top++;
			stack.stackArray[stack.top] = data;
		}
	}
	
}
