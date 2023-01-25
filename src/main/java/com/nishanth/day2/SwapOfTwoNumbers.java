package com.nishanth.day2;

public class SwapOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("before swap num1:"+num1+" and num2:"+num2);
        int temp = num1;
         num1 = num2;
         num2 = temp;

        System.out.println("After swap num1:"+num1+" and num2:"+num2);

    }
}
