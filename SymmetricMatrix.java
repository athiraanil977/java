import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean isSymmetric = true;
        if (rows != cols) {
            isSymmetric = false;
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        isSymmetric = false;
                        break;
                    }
                }
            }
        }
        if (isSymmetric) {
            System.out.println("Matrix is Symmetric");
        } else {
            System.out.println("Matrix is NOT Symmetric");
        }

        sc.close();
    }
}
