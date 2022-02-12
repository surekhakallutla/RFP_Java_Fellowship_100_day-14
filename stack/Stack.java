package com.bridgelabz.stack;

import java.util.Arrays;

public class Stack {
	
	int data;
	int top = -1;
	int stackArray[] = new int[3];
	int size = stackArray.length;
	
	@Override
	public String toString() {
		return "Stack [data=" + data + ", top=" + top + ", stackArray=" + Arrays.toString(stackArray) + ", size=" + size
				+ "]";
	}			
}
