/*
Name: Daniyal Maik
Roll Number: 2510303175
Assignment Number: 7
Task: 3
*/

public class Main {
    public static void main(String[] args) {
        int n = 1024;
        int count = 0;

       
        while (n > 1) {
            n = n / 2;
            count++;
        }

        System.out.println("Halving steps: " + count);
    }
}
