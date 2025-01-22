package com.mru.faqs;

public class SeparateAddDigits {

	public static void main(String[] args) {
		int[] originalArray = {123, 456, 789};
        int[] resultArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            int sum = 0;
            int number = originalArray[i];
            while (number > 0) {
                sum += number % 10;  
                number /= 10;        
            }
            resultArray[i] = sum;
        }
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
}
		