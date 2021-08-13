package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose : Calculate the temperature by using Fahrenheit-Celsius scaling
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-11
 */
public class TemperatureConversion {
    /**
     * This main method is used to calculate the temperature
     * @param args Unused
     */
    public static void main(String[] args) {
        double f, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice for conversion \n 1.Fahrenheit To Celsius \n 2.Celsius To Fahrenheit");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter Temperature in °F : ");
                f = sc.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.println("The Temperature in celsius scale is :" +c+ "°C");
                break;
            case 2:
                System.out.println("Enter Temperature in °C : ");
                c = sc.nextDouble();
                f = (c * 9) / 5 + 32 ;
                System.out.println("The Temperature in fahrenheit scale is :" +f+ "°F");
                sc.close();
        }
    }
}
