package com.arrays;

/*
Given two arrays arr1 and arr2 of equal size, the task is to find whether the given arrays are equal.
Two arrays are said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be different though.
Note: If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal.
 */

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class CheckEqualArrays {
    public static boolean equalArrays(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i=0; i<arr1.length; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,6,0,2,1,2,10,9};
        int[] arr2 = {0,2,3,6,10,1,2,9};
        System.out.println(equalArrays(arr1, arr2));
    }
}
