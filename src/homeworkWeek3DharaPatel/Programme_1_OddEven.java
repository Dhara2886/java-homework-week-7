package homeworkWeek3DharaPatel;

import java.util.Scanner;
// Write a java program that tells us that Input number is odd or even.
public class Programme_1_OddEven {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); //Scanner open

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }

            scanner.close(); // Scanner close
        }
    }




