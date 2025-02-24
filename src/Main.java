
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        double randomNum = rand.nextDouble(10) + 1;
        double guess;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
                scanner.next();
            }
            guess = scanner.nextDouble();
        } while (guess < 1 | guess > 10);

        System.out.println("The guess was: ");
        if (guess < randomNum) {
            System.out.println("Your guess was too low");
        } else if (guess > randomNum) {
            System.out.println("Your guess was too high");
        } else {
            System.out.println("Your guess was correct");
        }

        scanner.close();
    }
}

