package com.company;
import java.util.Scanner ;

// Basic Program 2
// Check if entered number/text is palindrome.

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Provide input to check if palindrome:");
        Scanner scan = new Scanner(System.in) ;
        String userInput = scan.nextLine();
        userInput = userInput.toLowerCase() ;
        String temp = "" ;
        for (int i=userInput.length()-1 ; i>=0 ; i--) {
            temp += userInput.charAt(i) ;
        }
        if (temp.equals(userInput)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
