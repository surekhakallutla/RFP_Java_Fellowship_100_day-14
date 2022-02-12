package com.bridgelabz.stack;

import java.util.Scanner;

public class UserInterface {
	Scanner scn = new Scanner(System.in);
	
	public int showMainMenu() {
		System.out.println("Select 1. Push Data into Stack \n2. Pop Data from Stack "
				+ "\n3.Print Stack \n4.Exit");
		int choice = scn.nextInt();
		return choice;
	
	}

}
