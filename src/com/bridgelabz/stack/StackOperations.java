package com.bridgelabz.stack;

public class StackOperations {
	Stack stack = new Stack();
	
	int stackList[] = new int[3];
	
	public int size() {
		return stackList.length;
	}
	
	public boolean isFull() {
		return stack.top > size() -1;
	}
	
	public boolean isEmpty() {
		return stack.top <= -1;
	}
	
	public int peek() {
		return stackList[stack.top];
	}

	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		
		else {
			stack.top++;
			stackList[stack.top] = data;
			System.out.println(data + "is added into the Stack");
		}
	}

}
