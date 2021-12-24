package com.company;
import java.util.Scanner ;

// Number Program 3
// Find the greatest common divisor (hcf) of two numbers.

public class Gcd {

    public static void main(String[] args) {
        System.out.println("Enter two numbers to calculate their gcd:");
        Scanner scan = new Scanner(System.in) ;
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num1<1 || num2<1) {
            System.out.println("Invalid. Please enter positive integers only.");
        }
        else {
            int gcd = 1 ;
            for (int i=1 ; i<= Math.min(num1,num2) ; i++) {
                if (num1%i==0 && num2%i==0) {
                    gcd = i ;
                }
            }
            System.out.println("The greatest common divisor is "+gcd);
        }
    }
}
