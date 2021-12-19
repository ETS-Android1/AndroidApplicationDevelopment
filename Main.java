package com.company;
import java.util.Scanner ;
import java.lang.Math ;
public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a number to check for neon and armstrong number.");
        Scanner scan = new Scanner(System.in) ;
        int num = scan.nextInt();

        // Neon Number

        int square = num * num ;
        int sum = 0 ;
        String temp = Integer.toString(square) ;
        for (int i=0; i<temp.length(); i++) {
            sum += Character.getNumericValue(temp.charAt(i)) ;
        }
        if (sum == num) {
            System.out.println(num + " is a neon number.");
        }
        else {
            System.out.println(num + " is not a neon number.");
        }

        // Armstrong Number

        String temp2 = Integer.toString(num) ;
        int sum2 = 0 ;
        int power = temp2.length() ;
        for (int j=0 ; j<power ; j++) {
            int number = Character.getNumericValue(temp2.charAt(j));
            sum2 += (int) (Math.pow(number,power)) ;
        }
        if (sum2 == num) {
            System.out.println(num + " is an armstrong number.");
        }
        else {
            System.out.println(num + " is not an armstrong number.");
        }

        // ISBN Number

        System.out.println("Enter a 10 digit number to check for ISBN number");
        long digit10 = scan.nextLong();
        String verify = Long.toString(digit10) ;
        if (verify.length() != 10) {
            System.out.println("Invalid. Please enter a 10 digit number.");
        }
        else {
            long temp3 = digit10;
            int sum3 = 0;
            for (int k = 0; k < 10; k++) {
                sum3 += (temp3 % 10) * (k + 1);
                temp3 = temp3 / 10;
            }
            if (sum3 % 11 == 0) {
                System.out.println(digit10 + " is an ISBN number.");
            } else {
                System.out.println(digit10 + " is not an ISBN number.");
            }
        }


    }
}
