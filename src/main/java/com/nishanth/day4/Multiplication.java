package com.nishanth.day4;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        for (int i = 20; i >= 1; i--){
            System.out.println(num+ " * " + i + " = "+(num*i));
        }


    }
}
