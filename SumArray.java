package com.company;
import java.util.Scanner ;

// Array Program 3
// Find the sum of all elements in an array.

public class SumArray {

    public static void main(String[] args) {
        System.out.println("Enter number of elements in array:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Enter the values in the array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i=0 ; i<size; i++) {
            sum += arr[i] ;
        }
        System.out.println("The sum of all elements is " + sum);
    }
}
