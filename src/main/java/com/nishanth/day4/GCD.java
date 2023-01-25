package com.nishanth.day4;

public class GCD {
    public static void main(String[] args) {
        int a = 40;
        int b = 24;
        int initA = a;
        int initB = b;
        for (; a != b;) {
            if (a > b) {
                a = a - b;
            }else{
                b = b - a;
            }

        }
        System.out.println("GCD of " + initA + " and " + initB + " is " + a);
    }
}


