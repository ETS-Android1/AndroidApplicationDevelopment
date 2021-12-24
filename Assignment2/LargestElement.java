package com.company;
import java.util.Scanner ;

// Array Program 2
// Find the largest element in an array.

public class LargestElement {

    public static void main(String[] args) {
        System.out.println("Enter number of elements in array:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Enter the values in the array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0] ;
        for (int i=0 ; i<size ; i++) {
            if (arr[i]>max) {
                max= arr[i] ;
            }
        }
        System.out.println("Largest element in the array is " + max);
    }
}
