package com.company;
import java.util.Scanner ;

// Number Program 2
// Check if entered number is a perfect square.

public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println("Enter a natural number to check if it is a perfect square:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0 ;
        if (num<0) {
            System.out.println("Invalid. Please enter a non-negative integer.");
        }
        else {
            for (int i=0 ; i*i <= num ; i++) {
                if (i*i == num) {
                    System.out.println("Perfect square");
                    count++ ;
                    break ;
                }
            }
            if (count ==0) {
                System.out.println("Not a perfect square");
            }
        }
    }
}
