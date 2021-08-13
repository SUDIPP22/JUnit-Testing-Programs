package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose : Determining of monthly payment
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-11
 */
public class MonthlyPayment {
    /**
     * This main method is used for calculating the monthly payment
     * @param args Unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Principal Amount : ");
        double P = sc.nextDouble();
        System.out.println("Enter The Rate Of Interest : ");
        double R = sc.nextDouble();
        double r = (R * 100) / 12;
        System.out.println("Enter The Year : ");
        double Y = sc.nextDouble();
        double n = 12 * Y;
        double monthlyPayment = (P * r) / (1 - Math.pow(1 + r, -n));
        System.out.println("Your Monthly Payment is :" + monthlyPayment);
        sc.close();
    }
}
