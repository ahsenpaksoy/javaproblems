package com.arrays;

import java.util.HashSet;
/*
You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive).
This array represents a permutation of the integers from 1 to n with one element missing. Your task is to
identify and return the missing element.

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.

 */
public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int miss = MissingNumberInArray.getMissingNumber(arr);
        System.out.println(miss);
        System.out.println(MissingNumberInArray.getMissingNumberWithXor(arr));
        System.out.println(MissingNumberInArray.getMissingNumberSet(arr));
    }

    public static int getMissingNumber(int arr[]) {
        int missingNumber = 0;
        for (int i = 1; i <= arr.length+1; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[j];
                if(i==temp){
                    found = true;
                    break;
                }
            }
            if(!found){
                missingNumber = i;
                break;
            }
        }
        return missingNumber;
    }

    public static int getMissingNumberWithXor(int arr[]){
        int n = arr.length + 1;

        // XOR all numbers from 1 to n
        int xorExpected = 0;
        for (int i = 1; i <= n; i++) {
            xorExpected ^= i;
        }

        // XOR all elements in the array
        int xorActual = 0;
        for (int num : arr) {
            xorActual ^= num;
        }

        // XOR of xorExpected and xorActual will give the missing number
        return xorExpected ^ xorActual;
    }

    public static int getMissingNumberSet(int arr[]) {
        int n = arr.length + 1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1; // In case no missing number is found
    }
}
