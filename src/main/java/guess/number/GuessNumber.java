package guess.number;

import java.util.Locale;
import java.util.Scanner;

public class GuessNumber {
    public static void guess(long left_border, long right_border) {
        Scanner scanner = new Scanner(System.in);
        while (right_border - left_border > 1) {
            long middle = (right_border + left_border) / 2;
            System.out.println("Is your number less than " + middle + "?");
            String ans = scanner.next();
            if (ans.toLowerCase(Locale.ROOT).equals("yes")) {
                right_border = middle;
            } else {
                left_border = middle;
            }
        }
        System.out.println("Your number is " + left_border + " !");
    }
}
