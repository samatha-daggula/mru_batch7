package com.mru.faqs;

public class ReverseArray {

	public static void main(String[] args) {
		int[] originalArray = {101, 102, 103, 104, 105};
        int left = 0;
        int right = originalArray.length - 1;
        
        while (left < right) {
            int temp = originalArray[left];
            originalArray[left] = originalArray[right];
            originalArray[right] = temp;
            left++;
            right--;
        }
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
    }
}