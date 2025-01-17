/**
 * 
 * Assignment 1
 * Name: Mark Kenneth Garcia
 * Program/course: Full Stack Web Development / Programmng 1
 * Created: 2025-01-17
 * Updated: 2025-01-17
 */

public class SquareCalculator {
    public static void main(String[] args) {

        // This section contains the starting value which can be updated by chaning the
        // startingValue number //

        int startingValue = 14;

        // Calculates the values of nine consecutive values with reusable method //

        print(startingValue);
        print(startingValue + 1);
        print(startingValue + 2);
        print(startingValue + 3);
        print(startingValue + 4);
        print(startingValue + 5);
        print(startingValue + 6);
        print(startingValue + 7);
        print(startingValue + 8);
    }

    public static void print(int number) {

        int squareOfNumber = number * number; // multiply by itself to get a square value //

        System.out.println("The square of " + number + " is " + squareOfNumber + ".");

    }
}
