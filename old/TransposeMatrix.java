import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of rows and columns of the matrix
        System.out.println("Enter the number of rows of the matrix: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns of the matrix: ");
        int columns = sc.nextInt();

        // Create a matrix
        int[][] matrix = new int[rows][columns];

        // Get the elements of the matrix
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Find the transpose of the matrix
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transpose of the matrix
        System.out.println("The transpose of the matrix is: ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}