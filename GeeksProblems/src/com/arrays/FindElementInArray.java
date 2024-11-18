package com.arrays;

/*
Given an array, arr of n integers, and an integer element x, find whether element x is present in the array.
Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.
 */

public class FindElementInArray {

    public static int findFirstOccurence(int[] arr, int x){
        for (int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2,5,9,1,23,12};
        int x = 23;
        System.out.println(findFirstOccurence(arr, x));
    }

}
