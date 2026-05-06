import java.util.Scanner;

public class W9Q4 {

    static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtInLength);

        sc.close();
    }
}