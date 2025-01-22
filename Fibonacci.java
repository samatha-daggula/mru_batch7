package com.mru.faqs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] fib = new int[n];
		fib[0] = 0;
		fib[1] = 1;
		System.out.print(fib[0]+" "+fib[1]+" ");

		for(int i=2;i<n;i++) {
			fib[i] = fib[i-1]+fib[i-2];
			}
		for(int element:fib) {

			System.out.print(element+" ");

		}

		}

	}