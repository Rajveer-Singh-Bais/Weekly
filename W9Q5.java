import java.util.Scanner;

public class W9Q5 {

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

    static String[] splitText(String text) {

        int length = findLength(text);
        int wordCount = 1;

        // Count words (spaces)
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];

        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < wordCount - 1) ? spaceIndexes[i] : length;

            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }

            words[i] = word;
            start = end + 1;
        }

        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] customSplit = splitText(text);
        String[] builtInSplit = text.split(" ");

        boolean result = compareArrays(customSplit, builtInSplit);

        System.out.println("Custom Split:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nBoth same? " + result);

        sc.close();
    }
}