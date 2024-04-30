package homeworkWeek3DharaPatel;

//Write a program to calculate the average value of array elements.

public class Programme_19_AverageOfAnArray {

        public static void main(String[] args) {
            int[] numbers = {11, 121, 51, 101, 21};

            // Calculate sum of array elements
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            // Calculate average
            double average = (double) sum / numbers.length;

            // Print the average
            System.out.println("Average value of array elements: " + average);
        }

}
