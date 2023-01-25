package com.nishanth.day3;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n = sc.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.println("the sum of first " + n + " natural numbers is "  + sum);
    }
}