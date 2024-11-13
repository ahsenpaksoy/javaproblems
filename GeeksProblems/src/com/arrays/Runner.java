package com.arrays;

public class Runner {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};
        int miss = MissingNumberInArray.getMissingNumber(arr);
        System.out.println(miss);
        System.out.println(MissingNumberInArray.getMissingNumberWithXor(arr));
    }
}
