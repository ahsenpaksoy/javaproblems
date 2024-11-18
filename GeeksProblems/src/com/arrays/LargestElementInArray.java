package com.arrays;
/*
Given an array arr[]. The task is to find the largest element and return it.
 */

public class LargestElementInArray {
    public static int findingLargestElement(int[] arr){
        int largest = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {12,4,8,34,75,56};
        System.out.println(findingLargestElement(arr));
    }
}
