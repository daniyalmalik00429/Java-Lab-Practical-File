/*
Name: Daniyal Maik
Roll Number: 2510303175
Assignment Number: 9
Task: 3
*/

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] > 5) {
                    count++;
                }
            }
        }

        System.out.println("Values greater than 5: " + count);
    }
}
