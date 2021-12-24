package com.company;
import java.util.Scanner ;

// Matrix Program 2
// Multiply two matrices.

public class MultiplyMatrices {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows in the matrix:");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns in the matrix:");
        int columns = scan.nextInt();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[columns][rows];
        System.out.println("Enter the values in the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the values in the second matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }
        System.out.println("The product matrix is :");
        int[][] result = new int[rows][rows] ;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = 0 ;
                for (int k=0 ; k<columns ; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j] ;
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
