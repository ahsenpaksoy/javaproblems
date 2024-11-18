package com.arrays;

public class Equillibrum {
//    Given an array arr of non-negative numbers. The task is to find the first equilibrium point in an array.
//    The equilibrium point in an array is an index (or position) such that the sum of all elements before that index is
//    the same as the sum of elements after it.
//
//    Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.
//
//    Examples:
//
//    Input: arr[] = [1, 3, 5, 2, 2]
//    Output: 3
//    Explanation: The equilibrium point is at position 3 as the sum of elements before it (1+3) = sum of elements after it (2+2).

//    Input: arr[] = [1]
//    Output: 1
//    Explanation: Since there's only one element hence it's only the equilibrium point.

//    Input: arr[] = [1, 2, 3]
//    Output: -1
//    Explanation: There is no equilibrium point in the given array.

    public static void main(String[] args) {
        int[] arr = {1,0};
        System.out.println(Equillibrum.getEquillibrum(arr));
    }

    private static int sum(int[] arr, int startIndex, int EndIndex) {
        int sum = 0;
        for (int i = startIndex; i <= EndIndex; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int getEquillibrum(int[] arr) {

        if (arr.length == 0) return -1;
        if (arr.length == 1) return 1;
        int leftSum = 0;
        int rightSum = sum(arr, 1, arr.length - 1);
        for (int i = 0; i <= arr.length - 2; i++) {
            if (i != 0) {
                int leftNu = arr[i - 1];
                int rightNu = arr[i];
                leftSum = leftSum + leftNu;
                rightSum = rightSum - rightNu;
            }
            if (leftSum == rightSum) return i + 1;
        }
        return -1;
    }
}
