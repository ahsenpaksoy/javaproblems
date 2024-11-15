package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

//        int[] arr = {1, 2, 3, 5};
//        int miss = MissingNumberInArray.getMissingNumber(arr);
//        System.out.println(miss);
//        System.out.println(MissingNumberInArray.getMissingNumberWithXor(arr));
//        System.out.println(MissingNumberInArray.getMissingNumberSet(arr));
//
//
//        int[] mylist =  {1,1,2,2};
//        List<Integer> resultList = new ArrayList<>();
//        resultList = ArrayOfDuplicatingNumbersInArray.getThearry(mylist);
//        System.out.println(resultList);
//
//        System.out.println(ArrayOfDuplicatingNumbersInArray.getDuplicatingNumbers(Arrays.stream(mylist)
//                .boxed() // Convert each int to Integer
//                .collect(Collectors.toList())));
//
//        int[] arr1 = {3, 5, 2, 5, 7, 7, 1};
//        Integer result = SecondLargestNumber.getNumber(arr1);
//        if (result != null){
//            System.out.println("The second largest number is: " + result);
//        } else {
//            System.out.println("There is no second largest number.");
//        }
//        System.out.println();
//        System.out.println(SecondLargestNumber.getSecondLargestWithSort(arr1));
//
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Pozitif bir sayi giriniz :");
//        int n = scan.nextInt();
//        PrintingPrimeNumber.printPrime(n);
        int[] mylist =  {1,1,2,2, 3};
        List<Integer> resultList = new ArrayList<>();
        resultList = ArrayOfDuplicatingNumbersInArray.getDuplicatesWithHasmap(mylist);
        System.out.println(resultList);


    }
}





