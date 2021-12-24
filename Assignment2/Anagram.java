package com.company;
import java.util.Scanner ;
import java.util.Arrays ;

// String Program 2
// Check if two strings are anagrams.

public class Anagram {

    public static void main(String[] args) {
        System.out.println("Enter the first string:");
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        String string2 = scan.nextLine();
        string1 = string1.toLowerCase() ;
        string2 = string2.toLowerCase() ;
        if (string1.length() != string2.length()) {
            System.out.println("Both the strings are not anagram");
        }
        else {
            char[] str1 = string1.toCharArray();
            char[] str2 = string2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            if(Arrays.equals(str1, str2)) {
                System.out.println("Both the strings are anagram");
            }
            else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}
