import java.util.Scanner;

public class W5Q3 {
    public static void main(String[] args) {
        int number;
        int[] table = new int[10];  // Array to store results

        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Store multiplication results from 1 to 10
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}