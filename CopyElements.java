package com.company;
import java.util.Scanner ;

// Array Program 1
// Copy all elements of one array into another array

public class CopyElements {

    public static void main(String[] args) {
        System.out.println("Enter number of elements in array:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt() ;
        System.out.println("Enter the values in the array:");
        int[] arr1 = new int[size];
        for (int i=0; i<size; i++) {
            arr1[i]= scan.nextInt();
        }
        int[] arr2 = new int[size] ;
        for (int i=0 ;i<size;i++){
            arr2[i] = arr1[i] ;
        }
        System.out.println("The old array :");
        for (int i=0; i<size; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("The new array : ");
        for (int i=0; i<size; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
