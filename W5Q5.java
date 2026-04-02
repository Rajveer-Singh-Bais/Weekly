import java.util.Scanner;

public class W5Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array
        while (number != 0) {
            // Resize array if needed
            if (index == maxDigit) {
                maxDigit += 10;

                int[] temp = new int[maxDigit];

                // Copy old data
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // Reassign
            }

            digits[index] = (int)(number % 10);
            number = number / 10;
            index++;
        }

        // Find largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output
        System.out.println("Largest digit: " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest digit found.");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        sc.close();
    }
}