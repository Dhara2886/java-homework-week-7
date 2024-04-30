package homeworkWeek3DharaPatel;
/*
 * Write a program to print the City name when input any alphabet from A to F.
 * If any other letter entered than entry is invalid.
 */

import java.util.Scanner;

public class Programme_8_CityName {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input alphabet
            System.out.print("Enter an alphabet from 'A' to 'F': ");
            char alphabet = scanner.next().toUpperCase().charAt(0);

            // Print city name based on the input alphabet
            if (alphabet == 'A') {
                System.out.println("City Name: Amsterdam");
            } else if (alphabet == 'B') {
                System.out.println("City Name: Berlin");
            } else if (alphabet == 'C') {
                System.out.println("City Name: Chicago");
            } else if (alphabet == 'D') {
                System.out.println("City Name: Delhi");
            } else if (alphabet == 'E') {
                System.out.println("City Name: Edinburgh");
            } else if (alphabet == 'F') {
                System.out.println("City Name: Florence");
            } else {
                System.out.println("Invalid entry. Please enter an alphabet from 'A' to 'F'.");
            }

            scanner.close();
        }

}
