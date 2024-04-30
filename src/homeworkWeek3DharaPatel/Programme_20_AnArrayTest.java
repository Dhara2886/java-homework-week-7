package homeworkWeek3DharaPatel;

//Write a program to test if an array contains a specific value.

public class Programme_20_AnArrayTest {

        public static void main(String[] args) {
            int[] numbers = {11, 121, 51, 101, 21};
            int targetValue = 61;

            // Flag to indicate if the target value is found
            boolean found = false;

            // Check if the array contains the target value
            for (int number : numbers) {
                if (number == targetValue) {
                    found = true;
                    break;
                }
            }

            // Print the result
            if (found) {
                System.out.println("The array contains the value " + targetValue + ".");
            } else {
                System.out.println("The array does not contain the value " + targetValue + ".");
            }
        }

}
