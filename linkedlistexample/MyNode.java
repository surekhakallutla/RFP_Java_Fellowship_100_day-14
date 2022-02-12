package com.bridgelabz.linkedlistexample;

public class MyNode<Generic> implements INode<Generic> {
	
	private Generic key;
	private INode<Generic> next;
	
	public MyNode(Generic key) {
		this.key = key;
		next = null;
	}

	@Override
	public Generic getKey() {
		return key;
	}

	@Override
	public void setKey(Generic value) {
		this.key = value;
	}

	@Override
	public INode<Generic> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<Generic> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyNode{key=").append(key).append("}");
		
		if(next != null)
			builder.append("->").append(next);
		
		return builder.toString();
	}
	
	
	

}