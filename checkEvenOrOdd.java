package com.mru.faqs;

import java.util.Scanner;

public class checkEvenOrOdd {

	public static void main(String[] args) {
		// read data dynamically
		// Scanner
		// Scanner is the predefined class, used to read data dynamically

		Scanner scanner = new Scanner(System.in);
		//system.in represent keyboard,Terminal  system.out
		
		//read number
		System.out.println("enter number :");
		int num = scanner.nextInt();
		
		
		if(num % 2 == 0) 
			System.out.println("Even number !!!"); 
		else
			System.out.println("Odd number !!! "); 		
		
	}

}
