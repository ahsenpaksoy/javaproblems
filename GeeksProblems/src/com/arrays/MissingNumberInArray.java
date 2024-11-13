package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MissingNumberInArray {

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
