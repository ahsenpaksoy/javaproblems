package com.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingPrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir sayi giriniz :");
        int n = scan.nextInt();
        PrintingPrimeNumber.printPrime(n);
    }

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