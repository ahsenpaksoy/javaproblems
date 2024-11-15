package com.arrays;

import java.util.Scanner;

public class PrintingPrimeNumber {

    private static boolean isPrime(int n){
        // n sayısının asal olup olmadıgını kontrol eder. asal ise True degilse False döner
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void printPrime(int k) {
        for (int i = 2; i <= k; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");

            }
        }
    }
}