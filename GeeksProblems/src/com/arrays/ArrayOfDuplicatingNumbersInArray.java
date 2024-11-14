package com.arrays;

import java.util.*;
/*
Given an array arr of integers, find all the elements that occur more than once in the array.
Return the result in ascending order. If no element repeats, return an empty array.
 */
public class ArrayOfDuplicatingNumbersInArray {

    public static List<Integer> getThearry(int[] mylist){

        List<Integer> foundArray = new ArrayList<>();

        for (int i = 0; i < mylist.length; i++) {
            for (int j = i+1; j <mylist.length ; j++) {
                if(mylist[i]== mylist[j]){
                    boolean isWithin = false;
                    for (int k = 0; k < foundArray.size(); k++) {
                        if(mylist[i] == foundArray.get(k)){
                            isWithin = true;
                        }
                    }
                    if (!isWithin){
                        foundArray.add(mylist[i]);
                    }
                }
            }
        }
        Collections.sort(foundArray);
        return foundArray;
    }

    public static List<Integer> getDuplicatingNumbers(List<Integer> mylist) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        List<Integer> foundArray = new ArrayList<>();

        for (Integer num : mylist) {
            // Check if the number has already been seen
            if (seen.contains(num)) {
                // If it's the first time we encounter this duplicate, add it to the foundArray
                if (!duplicates.contains(num)) {
                    foundArray.add(num);
                    duplicates.add(num);
                }
            } else {
                // Add the number to the seen set
                seen.add(num);
            }
        }

        return foundArray;
    }

}
