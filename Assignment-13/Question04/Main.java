/*
Name: Daniyal Maik
Roll Number: 2510303175
Assignment Number: 13
Task: 4
*/

public class Main {
    public static void main(String[] args) {
        String s = "abc";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
