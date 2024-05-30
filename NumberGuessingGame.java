import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        int guess;
                System.out.println("Welcome to the number guessing game!");
        System.out.println("A number is choosen between 1 to 100:");

        while (true) {
            guess = scanner.nextInt();
            if (guess == numberToGuess) {

                System.out.println("Congratulations,you guessed the number!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("your guess is too low.Try again:");
            } else {
                System.out.println("your guess is too high.Try again:");
            }
        }
    }
}