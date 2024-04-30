package homeworkWeek3DharaPatel;
//Write a program to check if the entered number is Positive, Negative or Zero.

import java.util.Scanner;

public class Programme_16_NumberChecker {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input number
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            // Check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("The entered number is POSITIVE.");
            } else if (number < 0) {
                System.out.println("The entered number is NEGATIVE.");
            } else {
                System.out.println("The entered number is ZERO.");
            }

            scanner.close();
        }

}
