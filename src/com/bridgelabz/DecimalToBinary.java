package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose : Converting Decimal to Binary
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-11
 */
public class DecimalToBinary {
    /**
     * This main method displaying the binary conversion
     * @param args Unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Decimal Number : ");
        int decimal = sc.nextInt();
        toBinary(decimal);
        sc.close();
    }

    /**
     * This method is used for converting into binary
     * @param n This is the first parameter to toBinary method
     */
    public static void toBinary(int n) {
        int[] binaryValue = new int[20];
        int i = 0;
        while (n > 0) {
            binaryValue[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryValue[j]);
        }
    }
}
