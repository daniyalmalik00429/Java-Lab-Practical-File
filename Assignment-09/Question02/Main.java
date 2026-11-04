/*
Name: Daniyal Maik
Roll Number: 2510303175
Assignment Number: 9
Task: 2
*/

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum: " + colSum);
        }
    }
}
