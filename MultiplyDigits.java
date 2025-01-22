package com.mru.faqs;

public class MultiplyDigits {

	public static void main(String[] args) {
		int[] originalArray = {12, 34, 56};
        int[] resultArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            int product = 1;
            int number = originalArray[i];
            while (number > 0) {
                product *= number % 10; 
                number /= 10;             
            }
            resultArray[i] = product;
        }
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
}