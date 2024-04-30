package homeworkWeek3DharaPatel;

//Write a program to sort a numeric array and a string array.
import java.util.Arrays;

public class Programme_17_SortingArrays {

        public static void main(String[] args) {
            int[] numericArray = {11, 2, 9, 1, 7};

            // Sorting numeric array
            Arrays.sort(numericArray);

            // Printing sorted array
            System.out.println("Sorted numeric array:");
            for (int num : numericArray) {
                System.out.println(num + " ");
            }

            String[] stringArray = {"Mango", "Goa", "Iceland", "Holiday", "Lottery"};

            // Sorting string array
            Arrays.sort(stringArray);

            // Printing sorted array
            System.out.println("Sorted string array:");
            for (String str : stringArray) {
                System.out.println(str + " ");
            }

        }

}
