package com.company;
import java.util.Scanner ;

// Matrix Program 3
// Find transpose of a matrix.

public class TransposeMatrix {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows in the matrix:");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns in the matrix:");
        int columns = scan.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the values in the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("The transpose matrix is :");
        int[][] transpose = new int[columns][rows] ;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
