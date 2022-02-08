package com.bridgelabz.linkedlistexample;

public interface INode <Generic> {
	
	Generic getKey();
	void setKey(Generic key);
	
	INode<Generic> getNext();
	void setNext(INode<Generic> next);
	
}
