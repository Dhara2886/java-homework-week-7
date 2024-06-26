package homeworkWeek3DharaPatel;
//Write the program to get city name for letters A to F using the switch statement

import java.util.Scanner;

public class Programme_9_CityNameSwitch {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input alphabet
            System.out.print("Enter an alphabet from 'A' to 'F': ");
            char alphabet = scanner.next().toUpperCase().charAt(0);

            // Print city name based on the input alphabet using switch statement
            switch (alphabet) {
                case 'A':
                    System.out.println("City Name: Amsterdam");
                    break;
                case 'B':
                    System.out.println("City Name: Berlin");
                    break;
                case 'C':
                    System.out.println("City Name: Chicago");
                    break;
                case 'D':
                    System.out.println("City Name: Delhi");
                    break;
                case 'E':
                    System.out.println("City Name: Edinburgh");
                    break;
                case 'F':
                    System.out.println("City Name: Florence");
                    break;
                default:
                    System.out.println("Invalid entry. Please enter an alphabet from 'A' to 'F'.");
            }

            scanner.close();
        }


}
