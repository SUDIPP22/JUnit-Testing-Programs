package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose : Determining the square root of a non-negative number
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-11
 */
public class SquareRoot {
    /**
     * This main method is used for calculating the roots
     * @param args Unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Non-Negative Number : ");
        double c = sc.nextDouble();
        double epsilon = 1.0e-15;
        double t = c;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        System.out.println("The Square Root of The Number is : " + t);
        sc.close();
    }
}
