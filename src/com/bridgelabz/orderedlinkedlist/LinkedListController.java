package com.bridgelabz.orderedlinkedlist;

import java.util.ArrayList;

public class LinkedListController {

	public static Node head = null;
	public static Node tail = null;
	
	private ArrayList <Node> nodeList = new ArrayList <Node> ();
	
	public ArrayList <Node> getMedicineList() 
	{
		return nodeList;
	}
	
	public void add(Node node)
	{
		nodeList.add(node);		
	}
		
	public void remove(Node node)
	{
		nodeList.remove(node);	
	}
			
}
