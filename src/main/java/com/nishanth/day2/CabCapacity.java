package com.nishanth.day2;

import java.util.Scanner;

public class CabCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people");
        int count = sc.nextInt();
        System.out.println("Enter the cab capacity");
        int capacity = sc.nextInt();
        if (count % capacity != 0) {
            System.out.println(count / capacity + 1 + "cabs are required");
        }else {
            System.out.println(count / capacity + "cabs are required");
        }

    }
}
