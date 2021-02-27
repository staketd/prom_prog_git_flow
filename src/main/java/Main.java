import guess.number.GuessNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.printf("Hello, %s!%n", name);
        System.out.println("¯\\_(ツ)_/¯");
        System.out.println("Enter borders of guess number game:");
        long left = scanner.nextLong();
        long right = scanner.nextLong();
        GuessNumber.guess(left, right);
    }
}
