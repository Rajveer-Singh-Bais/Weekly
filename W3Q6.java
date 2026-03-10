import java.util.Scanner;

public class W3Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Part 1: Using multiple if-else statements
        if (year < 1582) {
            System.out.println("Year must be >= 1582 for Gregorian calendar.");
        } else {
            if (year % 4 != 0) {
                System.out.println("The year " + year + " is not a Leap Year.");
            } else if (year % 100 != 0) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else if (year % 400 == 0) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }

        // Part 2: Using a single if statement with multiple logical conditions
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("The year " + year + " is a Leap Year (checked using single if).");
        } else if (year >= 1582) {
            System.out.println("The year " + year + " is not a Leap Year (checked using single if).");
        }

        sc.close();
    }
}
