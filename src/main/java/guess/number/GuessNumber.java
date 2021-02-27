package guess.number;

import java.util.Scanner;

public class GuessNumber {
    public static void guess(int left_border, int right_border) {
        Scanner scanner = new Scanner(System.in);
        while (right_border - left_border > 1) {
            int middle = (right_border + left_border) / 2;
            System.out.println("Is your number less than " + middle + "?");
            String ans = scanner.next();
            if (ans.equals("yes")) {
                right_border = middle;
            } else {
                left_border = middle;
            }
        }
        System.out.println("Your number is " + left_border + " !");
    }
}
