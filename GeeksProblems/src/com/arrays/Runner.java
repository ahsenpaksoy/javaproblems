package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};
        int miss = MissingNumberInArray.getMissingNumber(arr);
        System.out.println(miss);
        System.out.println(MissingNumberInArray.getMissingNumberWithXor(arr));
        System.out.println(MissingNumberInArray.getMissingNumberSet(arr));


        int[] mylist =  {1,1,2,2};
        List<Integer> resultList = new ArrayList<>();
        resultList = ArrayOfDuplicatingNumbersInArray.getThearry(mylist);
        System.out.println(resultList);

        System.out.println(ArrayOfDuplicatingNumbersInArray.getDuplicatingNumbers(Arrays.stream(mylist)
                .boxed() // Convert each int to Integer
                .collect(Collectors.toList())));
    }
}
