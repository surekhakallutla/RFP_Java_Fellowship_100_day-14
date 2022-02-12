package com.bridgelabz.likedlist;

public class LinkedList { 
	
    public static void main(String[] args) {    
            
        ListUpdation listUpdate = new ListUpdation();
                     
        listUpdate.addNode(1);    
        listUpdate.addNode(2);    
        listUpdate.addNode(3);    
        listUpdate.addNode(4);    
            
        listUpdate.display();    
        
        listUpdate.removeNode(2);
        
        listUpdate.display();    
    }    
}    
