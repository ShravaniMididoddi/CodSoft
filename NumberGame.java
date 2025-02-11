package Task;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean playAgain = true;
		int totalScore = 0;
		System.out.println("Welcome to the number guessing game!!");
		while (playAgain) {
			int targetNumber = random.nextInt(100) + 1;
			int attempts = 0;
			int maxAttempts = 10;
			boolean guessedCorrectly = false;
			System.out.println("\nSelect a number between 1and100");
			System.out.println("You have " + maxAttempts + " attempts to guess it.");
			while (attempts < maxAttempts) {
				System.out.println("Enter your guess :");
				int userGuess = scanner.nextInt();
				attempts++;
				if (userGuess == targetNumber) {
					System.out.println(
							"Congratulations you have guessed the correct number in " + attempts + " attempts :");
					totalScore += (maxAttempts - attempts + 1);
					guessedCorrectly = true;
					break;
				} else if (userGuess < targetNumber) {
					System.out.println("Two low!! Try Again!!!");
				} else {
					System.out.println("Too high! Try Again!!!");
				}
			}
			if (!guessedCorrectly) {
				System.out.println("Sorry!!You've used all attempts. The correct number was" + targetNumber + ".");
			}
			System.out.println("Your total score :" + totalScore);
			System.out.println("Do you want to play again? (Yes/No);");
			String response = scanner.next();
			playAgain = response.equalsIgnoreCase("Yes");
		}
		System.out.println("Thanks for playing!! Your Final score: " + totalScore);
		scanner.close();
	}
}