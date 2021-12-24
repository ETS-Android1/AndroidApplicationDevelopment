package com.company;
import java.util.Scanner ;

// Matrix Program 1
// Add two matrices.

public class AddMatrices {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows in the matrix:");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns in the matrix:");
        int columns = scan.nextInt();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns] ;
        System.out.println("Enter the values in the first matrix:");
        for (int i = 0; i < rows; i++) {
            for(int j=0; j<columns; j++){
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the values in the second matrix:");
        for (int i = 0; i < rows; i++) {
            for(int j=0; j<columns; j++){
                matrix2[i][j] = scan.nextInt();
            }
        }
        System.out.println("The sum matrix is :");
        int[][] result = new int[rows][columns] ;
        for (int i = 0; i < rows; i++) {
            for(int j=0; j<columns; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j] ;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
