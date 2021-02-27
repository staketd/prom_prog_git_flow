import guess.number.GuessNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer a = 1 / 0; // severe bug;
        System.out.println("I'm a new java app!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name: ");
        String name = scanner.next();
        System.out.printf("Hello, %s!%n", name);
        System.out.println("¯\\_(ツ)_/¯");
        System.out.println("Enter borders of guess number game:");
        long left = scanner.nextLong();
        long right = scanner.nextLong();
        GuessNumber.guess(left, right);
    }
}
