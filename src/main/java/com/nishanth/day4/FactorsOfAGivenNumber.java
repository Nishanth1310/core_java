package com.nishanth.day4;

import java.util.Scanner;

public class FactorsOfAGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = sc.nextInt();
        int count = 0;
        for (int j = 1; j <= num; j++) {
            if (num % j == 0) {
                count++;

                System.out.println(j );
            }

        }
        if (count == 2) {
            System.out.println("\n" + num + " is a prime");
        }else {
            System.out.println("\n" + num + " is not a prime");
        }
    }
}