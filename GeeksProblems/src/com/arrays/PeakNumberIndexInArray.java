package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class PeakNumberIndexInArray {

    public static void main(String[] args) {
        System.out.println(PeakNumberIndexInArray.getPeakNumber(new int[] {1,1,2,3,1,1}));
    }

    public static List<Integer> getPeakNumber(int[] arr) {
        List<Integer> peakArr = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++)
        {
            if (i == 0)
            {
                if (arr[i] >= arr[i + 1])
                {
                    peakArr.add(i);
                }
            } else if (i == arr.length - 1)
            {
                if (arr[i] >= arr[i - 1])
                {
                    peakArr.add(i);
                }
            }

            else {
                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                {
                    peakArr.add(i);
                }
            }
        }
        return peakArr;
    }
}