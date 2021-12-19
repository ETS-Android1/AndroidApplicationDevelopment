package com.company;
import java.lang.Math ;
import java.util.Scanner;

public class Classwork1 {

    public static void main(String[] args) {

        int num = (int) (Math.random()*100) ;
        int userNum = 0 ;
        while (userNum>=0){
            System.out.println("Enter a number from 0 to 100");
            Scanner scan = new Scanner(System.in) ;
            userNum = scan.nextInt();
            if (userNum<0) {
                System.out.println("Invalid input");
            }
            else if (userNum == num) {
                System.out.println("Correct answer");
                break ;
            }
            else if (userNum > num) {
                System.out.println("Entered number is larger");
            }
            else {
                System.out.println("Entered number is smaller");
            }
        }

    }
}
