package com.company;
import java.util.Scanner ;

// Basic Program 3
// Calculate factorial of a given number.

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Enter a whole number :");
        Scanner scan = new Scanner(System.in) ;
        int num = scan.nextInt();
        int factorial = 1 ;
        if (num<0) {
            System.out.println("Invalid. Enter a non-negative integer.");
        }
        else if (num==0 || num==1) {
            System.out.println("Factorial of "+num+" is 1");
        }
        else {
            for (int i=num; i>1; i--) {
                factorial *= i ;
            }
            System.out.println("Factorial of "+num+" is "+factorial);
        }
    }
}
