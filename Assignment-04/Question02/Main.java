/*
Name: Daniyal Maik
Roll Number: 2510303175
Assignment Number: 4
Task: 2
*/

public class Main {
    public static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static int nPr(int n, int r) {
        return fact(n) / fact(n - r);
    }

    public static void main(String[] args) {
        System.out.println("5P2 = " + nPr(5, 2));
    }
}
