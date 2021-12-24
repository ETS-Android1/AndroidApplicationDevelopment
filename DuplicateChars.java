package com.company;
import java.util.Scanner ;

// String Program 3
// Find the duplicate characters in a string.

public class DuplicateChars {

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        int count ;
        char[] str = userInput.toCharArray();
        System.out.println("Duplicate characters in the given string are:");
        for(int i = 0; i <str.length; i++) {
            count = 1;
            if (str[i] != '0') {
                for(int j = i+1; j <str.length; j++) {
                    if(str[i] == str[j] && str[i] != ' ') {
                        count++;
                        str[j] = '0';
                    }
                }
                if(count > 1 )
                    System.out.print(str[i] + " ");
            }

        }
    }
}
