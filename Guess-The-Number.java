/**
 * A Simple Number Guessing Game
 *
 * @author (Divyanshu Dhruv)
 */

import java.util.Scanner;
import java.util.Arrays;

public class GuessTheNumber {

    private int z; // The guessed number
    private final Scanner scanner;

    public GuessTheNumber() {
        z = 0;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("--------------------");
        System.out.println("1) Play Game");
        System.out.println("2) Instructions");
        System.out.println("3) Exit");
        System.out.println("--------------------");
    }

    public void start() {
        
        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 : playGame();
                case 2 : showInstructions();
                case 3 : {
                    System.out.println("Exiting the game. Goodbye!");
                    System.exit(0);
                }
                default : System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void playGame() {
        z = 0;
        int[][] numberSets = {
                {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99},
                {2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31, 34, 35, 38, 39, 42, 43, 46, 47, 50, 51, 54, 55, 58, 59, 62, 63, 66, 67, 70, 71, 74, 75, 78, 79, 82, 83, 86, 87, 90, 91, 94, 95, 98, 99},
                {4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31, 36, 37, 38, 39, 44, 45, 46, 47, 52, 53, 54, 55, 60, 61, 62, 63, 68, 69, 70, 71, 76, 77, 78, 79, 84, 85, 86, 87, 92, 93, 94, 95},
                {8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31, 40, 41, 42, 43, 44, 45, 46, 47, 56, 57, 58, 59, 60, 61, 62, 63, 72, 73, 74, 75, 76, 77, 78, 79, 88, 89, 90, 91, 92, 93, 94, 95},
                {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95},
                {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 96, 97, 98, 99},
                {64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}
        };

        for (int i = 0; i < numberSets.length; i++) {
            System.out.println("Is your number in this set?");
            printCube(numberSets[i]);
            System.out.print("Enter 1 for Yes, 0 for No: ");
            int answer = scanner.nextInt();
            if (answer == 1) {
                z += (1 << i); // Add 2^i to z
            }
        }
        System.out.println("Your number is: " + z);
        System.exit(0);
    }

    private void printCube(int[] numbers) {
        int size = (int) Math.ceil(Math.cbrt(numbers.length));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    int index = i * size * size + j * size + k;
                    if (index < numbers.length) {
                        System.out.printf("%3d ", numbers[index]);
                    } else {
                        System.out.print("    ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    private void showInstructions() {
        System.out.println("Instructions:");
        System.out.println("1. Think of a number between 1 and 99.");
        System.out.println("2. Answer the questions with '1' for Yes and '0' for No.");
        System.out.println("3. The program will guess your number!");
    }

    public static void main(String[] args) {
        new GuessTheNumber().displayMenu();
        new GuessTheNumber().start();
    }
}
