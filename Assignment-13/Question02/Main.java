/*
Name: Daniyal Maik
Roll Number: 2510303175
Assignment Number: 13
Task: 2
*/

public class Main {
    public static void main(String[] args) {
        String word = "Java";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}
