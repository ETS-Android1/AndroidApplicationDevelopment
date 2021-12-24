package com.company;
import java.util.Scanner ;

// Number Program 1
// Reverse the entered number.

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number to be reversed :");
        Scanner scan = new Scanner(System.in) ;
        int num = scan.nextInt();
        int reverseNum = 0 ;
        if (num<0) {
            System.out.println("Invalid. Enter a non-negative integer.");
        }
        else {
            while (num!=0) {
                int digit = num % 10 ;
                reverseNum = reverseNum*10 + digit ;
                num /= 10 ;
            }
            System.out.println("The reverse number is "+reverseNum);
        }
    }
}
