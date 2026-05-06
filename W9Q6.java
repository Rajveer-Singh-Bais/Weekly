import java.util.Scanner;

public class W9Q6{

    static double[][] inputData(Scanner sc, int n) {
        double[][] data = new double[n][2];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        return data;
    }

    static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    static String[][] computeBMI(double[][] data) {
        int n = data.length;
        String[][] result = new String[n][4];

        for (int i = 0; i < n; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            String status = getStatus(bmi);

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    static void display(String[][] result) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;

        double[][] data = inputData(sc, n);
        String[][] result = computeBMI(data);

        display(result);

        sc.close();
    }
}