package homeworkWeek3DharaPatel;
//Write a program to sum values of an array.

public class Programme_18_SumOfAnArray {

        public static void main(String[] args) {
            int[] numbers = {11, 121, 51, 101, 21};

            // Calculate sum of array elements
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            // Print the sum
            System.out.println("Sum of array elements: " + sum);
        }

}
