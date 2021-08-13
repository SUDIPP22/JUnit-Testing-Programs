package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose : Find the Fewest Notes to be returned by Vending Machine
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-11
 */
public class VendingMachine {
    static  int i =0;
    static int total =0;

    static int[] notes ={ 1000,500,100,50,10,5,2,1};
    static int money;

    /**
     * Purpose : This method is used to calculate the notes
     * @param money This is the first parameter
     * @param notes This is the second parameter
     * @return The notes
     */
    public static int calculate(int money, int[] notes) {
        int rem;
        if(money==0)
            return -1;
        else {
            if(money>=notes[i]) {
                int calNotes = money / notes[i];
                rem = money % notes[i];
                money=rem;
                total += calNotes;
                System.out.println(notes[i]+ " Notes : " +calNotes);
            }
            i++;
            return  calculate(money,notes);
        }
    }

    /**
     * This main method is used to utilize by the calculate method
     * @param args Unused
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Amount : ");
        money = sc.nextInt();
        VendingMachine.calculate(money,notes);
        System.out.println("Total Number of Notes are : " +total);
        sc.close();
    }
}
