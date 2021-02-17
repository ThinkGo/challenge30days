package hackerrank.challenge30days;

import java.util.Scanner;
public class Day1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scanner = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        final String line = scanner.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scanner.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("hello world ");

        System.out.println(line);

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
    }
}