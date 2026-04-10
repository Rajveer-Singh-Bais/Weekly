import java.util.Random;

public class W7Q6 {

    public static int getSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public static double getMean(int[] heights) {
        return (double) getSum(heights) / heights.length;
    }

    public static int getShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    public static int getTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        System.out.print("Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int sum = getSum(heights);
        double mean = getMean(heights);
        int shortest = getShortest(heights);
        int tallest = getTallest(heights);

        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}