package com.arrays;

import java.util.Arrays;

/*
Given an array of positive integers arr[], return the second largest element from the array.
If the second largest element doesn't exist then return -1.
Note: The second largest element should not be equal to the largest element.
 */
public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 2, 5, 7, 7, 1};
        Integer result = SecondLargestNumber.getNumber(arr1);
        if (result != null){
            System.out.println("The second largest number is: " + result);
        } else {
            System.out.println("There is no second largest number.");
        }
        System.out.println();
        System.out.println(SecondLargestNumber.getSecondLargestWithSort(arr1));
    }

    public static int getNumber(int[] arr){
        if(arr == null || arr.length<2){
            return -1;
        }

        Integer largetsNu = null;
        Integer secLargestNu = null;

      for (int number:arr ){
          if(largetsNu==null || number>largetsNu){
              secLargestNu = largetsNu;
              largetsNu = number;

          } else if (number < largetsNu && (secLargestNu == null || number > secLargestNu)) {
              secLargestNu = number;
          }
      }
        return secLargestNu;
    }


    public static Integer getSecondLargestWithSort(int[] arr){
        if(arr == null || arr.length < 2){
            return null;
        }
        Arrays.sort(arr);
        // Start from the second-to-last element and find the first distinct element
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                return arr[i];
            }
        }
        return null;
    }
}







