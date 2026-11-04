/*
Name: Daniyal Maik
Roll Number: 2510303175
Assignment Number: 13
Task: 3
*/

public class Main {
    public static void main(String[] args) {
        String s = "racecar";
        boolean isPal = true;
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPal = false;
                break;
            }
            left++;
            right--;
        }

        if (isPal) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
