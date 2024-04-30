package homeworkWeek3DharaPatel;
// Write a program to print the numbers between 1 and 100 which are divisible by 3 and 5 separately

public class Programme_11_DivisibleByThreeAndFive {

        public static void main(String[] args) {
            System.out.println("Numbers between 1 and 100 divisible by 3:");
            printNumbersDivisibleByThree();

            System.out.println("\nNumbers between 1 and 100 divisible by 5:");
            printNumbersDivisibleByFive();
        }

        public static void printNumbersDivisibleByThree() {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void printNumbersDivisibleByFive() {
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }


}
