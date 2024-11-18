package com.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    /*
    You are given an array arr of positive integers. Your task is to find all the leaders in the array.
    An element is considered a leader if it is greater than or equal to all elements to its right.
    The rightmost element is always a leader.
     */
    public static ArrayList<Integer> findLeaders(int arr[]){
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxSoFar = arr[arr.length-1];
        leaders.add(maxSoFar);   // The rightmost element is always a leader

        // Traverse from right to left
        for (int i=arr.length-2; i>=0; i--){
            if (arr[i] >= maxSoFar){
                maxSoFar = arr[i];
                leaders.add(maxSoFar);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(findLeaders(arr));
    }
}
