package com.nishanth.day3;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the buying price :");
        double buyingPrice = sc.nextDouble();
        System.out.println("Enter the selling price :");
        double sellingPrice = sc.nextDouble();
        double res = sellingPrice - buyingPrice;
        if (res < 0) {
            System.out.println("you incurred a loss of " + res);
        } else if (res > 0) {
            System.out.println("You incurred a profit of " + res);
        }else{
            System.out.println("no profit or loss");

    }
    }
}
