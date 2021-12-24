package com.company;
import java.util.Scanner ;

// String Program 1
// Find the number of non-space characters present in a string.

public class NoOfChars {

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine() ;
        int count = 0 ;
        for (int i=0 ; i<userInput.length() ; i++) {
            if (userInput.charAt(i)!=' ') {
                count++ ;
            }
        }
        System.out.println("Total number of non-space characters in the string is " + count);
    }
}
