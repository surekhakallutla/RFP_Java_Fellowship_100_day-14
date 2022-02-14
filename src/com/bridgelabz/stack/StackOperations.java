package com.bridgelabz.stack;

import java.util.ArrayList;

public class StackOperations {
	
	Stack stack = new Stack();
	int stackList[] = new int[3];
	
//	private ArrayList <Stack> stackList = new ArrayList <Stack> ();
	
	private StackOperations() {
		
	}
	
	private static StackOperations instance;
	
	public static StackOperations getInstance() {
		if(instance == null) {
			instance = new StackOperations();
		}
		return instance;
	}
/*	
	public ArrayList <Stack> getStackList() 
	{
		return stackList;
	}
	
	public Stack getStack(int data) {
		for(Stack stack : stackList) {
			if(data == stack.data) {
				return stack;
			}
		}
		return null;
	}

	public void add(Stack stack)
	{
		stackList.add(stack);		
	}
		
	public void remove(Stack stack)
	{
		stackList.remove(stack);	
	}
*/	
	public int size() {
		return stackList.length;
	}
	
	public boolean isFull() {
		return stack.top > size() - 1;
	}
	
	public boolean isEmpty() {
		return stack.top <= -1;
	}
	
	public Integer peek() {
		if(isEmpty())
			return null;
		else 
		return stackList[stackList.length - 1];
	}
		
	
	
	public void push(int  data) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		
		else {
			stack.top++;
			stackList[stack.top] = data;
			System.out.println(data + " is pushed into the stack");

		}
	
	}
	
}
