package com.nishanth.day3;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the employee id :");
        int empno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the employee name : ");
        String name = sc.nextLine();
        System.out.println("Enter the salary monthly ; ");
        double salary = sc.nextDouble();
        double yearlySalary = salary*12;
        System.out.println(empno+" - " + name+ " - "+ salary + " - "+ yearlySalary);
    }
}
