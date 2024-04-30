package homeworkWeek3DharaPatel;

import java.util.Scanner;

//Write a program to input Student details and marks in 3 subjects to create a result on a mark sheet.

public class Programme_3_MarkSheet {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input student details
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();

            // Input marks for three subjects
            System.out.println("Enter marks for Math, Science, and English (between 0 to 100):");
            System.out.print("Math: ");
            int mathMarks = scanner.nextInt();
            System.out.print("Science: ");
            int scienceMarks = scanner.nextInt();
            System.out.print("English: ");
            int englishMarks = scanner.nextInt();

            // Validate marks range
            if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
                return;
            }

            // Calculate total marks, percentage, and determine result
            int totalMarks = mathMarks + scienceMarks + englishMarks;
            double percentage = (totalMarks / 3.0);
            String result = (percentage >= 35) ? "Pass" : "Fail";

            // Determine grade
            String grade;
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "D";
            }

            // Print mark sheet
            System.out.println("________________________________________");
            System.out.println("|                                       |");
            System.out.println("|           Mark Sheet                  |");
            System.out.println("|_______________________________________|");
            System.out.println("| Name     :        " + name + "               |");
            System.out.println("| Roll No  :        " + rollNo + "             |");
            System.out.println("|_______________________________________|");
            System.out.println("| Subjects : Marks                      |");
            System.out.println("|_______________________________________|");
            System.out.println("| Math     :         " + mathMarks + "          |");
            System.out.println("| Science  :         " + scienceMarks + "       |");
            System.out.println("| English  :         " + englishMarks + "       |");
            System.out.println("|_______________________________________|");
            System.out.println("| Total    :         " + totalMarks + "         |");
            System.out.println("|_______________________________________|");
            System.out.println("| Percentage :       " + percentage + "       |");
            System.out.println("| Result     :       " + result + "           |");
            System.out.println("| Grade      :       " + grade + "            |");
            System.out.println("|_______________________________________|");

            scanner.close();

    }


}
