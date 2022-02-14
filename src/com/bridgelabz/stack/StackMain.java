package com.bridgelabz.stack;

import java.util.Scanner;

public class StackMain {
	
	static {
		System.out.println("Welcome to Stack Program");
	}
	
	static Scanner scn = new Scanner(System.in);
	static UserInterface user = new UserInterface();
	
	public void handleUserSelection(int choice) {
		StackOperations stackOpe = StackOperations.getInstance();
		Stack stack = new Stack();
		
		switch(choice) {
		case 1:
			
			for(int i = 0 ; i < stackOpe.size(); i++) {
				System.out.println("Enter value to push");
				int data = scn.nextInt();
				stackOpe.push(data);
			}
			
			System.out.println("Elements are Added to Stack");
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			System.out.println("Exited from Main Menu");
			break;
		}
		
	}

	public static void main(String[] args) {
		
		StackMain main = new StackMain();
		
		int choice = 0;
		while(choice != 4) {
			choice = user.showMainMenu();
			main.handleUserSelection(choice);
		}
	
	}

}
