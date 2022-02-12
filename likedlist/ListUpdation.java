package com.bridgelabz.likedlist;

public class ListUpdation {
	
	public Node head = null;    
    public Node tail = null;   
    public int size;
       
    public void addNode(int data) { 
    	
    	Node newNode = new Node(data);  
          
        if(head == null) {     
            head = newNode;    
            tail = newNode;    
        }    
        
        else {    
            tail.next = newNode;     
            tail = newNode;    
        }  
        size++;
    }    
          
    public void removeNode(int data) {   

    	Node temp;
    	Node current;
    	  
        if(head == null) {     
           System.out.println("LinkedList is Empty");      
           return;
        }    
        
        else {   
        	int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
        	
        	if(head != tail) {
        		temp = head;
        		current = null;
             	
	        	for( int i = 0; i < count-1; i++) {
	        		current = temp;
	        		temp = temp.next;
	        	}
	        	
	        	if(current != null)
	        	{
	        		current.next = temp.next;
	        		temp = null;
	        	}
	        	
	        	else {
	        		head = tail;
	        		tail = temp.next;
	        		temp = null;
	        	}
	        		
        	}
        	
        	else {
        		head = tail;
        		tail = null;
        	}
        }    
        size--;
    }  
    
    public void display() {  
    	
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }  
        
        System.out.println("Nodes of singly linked list: ");    
        
        while(current != null) {        
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        
        System.out.println();    
    }    
    
}
