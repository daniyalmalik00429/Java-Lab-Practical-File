/*
Name: Daniyal Maik
Roll Number: 2510303175
Assignment Number: 2
Task: 4
*/

public class Main {
    public static void main(String[] args) {
        int n = 5;
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of 5 is " + fact);
    }
}