package com.company;
import java.util.Scanner ;

// Basic Program 1
// Check if entered number is a prime number.

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Enter a natural number :");
        Scanner scan = new Scanner(System.in) ;
        int num = scan.nextInt();
        if (num<2) {
            System.out.println("Not a prime number.");
        }
        int count = 0 ;
        for (int i=2 ; i<num ; i++) {
            if (num%i==0) {
                System.out.println("Not a prime number.");
                count++ ;
                break;
            }
        }
        if (count==0) {
            System.out.println("Prime Number.");
        }
    }
}
