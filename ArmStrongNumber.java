package com.mru.faqs;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number :");
		int num = scanner.nextInt();
		//store number to original number to overcome mutability issue
		int original_num = num;
		
		//step1: read no.of digits
		int digits = String.valueOf(num).length();
		
		double result = 0;
		
		//step2: last number
		while(num!=0) {
			int last = num%10;
			
		//step3: do the "last" power to "digits
			result = result+Math.pow(last, digits);
		 
		//step4: delete last digit
			num = num/10;
		}
		if(original_num == result)
			System.out.print("ArmStrong !!!");
		else
			System.out.print("Not ArmStrong !!!");

	}

}
