public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mas1 = new int[]{99, 116, 86, 62, 61, 58, 71, 95, 108, 104, 64, 87, 51, 115, 97, 71, 81, 43, 54, 100, 73, 67, 57, 88, 65};
        double[] mas2 = new double[]{1.91, 2.07, 1.59, 1.49, 2.17, 1.29, 2.04, 1.72, 2.45, 2.63, 1.75, 1.99, 1.64, 2.46, 1.66, 1.80, 2.06, 1.82, 1.69, 2.13, 1.40, 1.45, 2.28, 2.71, 1.76};
        int num1 = 0;
        double num2 = 0;
        for (int i = 0; i < mas1.length; i++) {
            num1 = mas1[i];
            num2 = mas2[i];
            if (bmi(num1, num2) < 18.5)
                System.out.print("under ");
            if (bmi(num1, num2) >= 18.5 && bmi(num1, num2) < 25.0)
                System.out.print("normal ");
            if (bmi(num1, num2) >= 25.0 && bmi(num1, num2) < 30.0)
                System.out.print("over ");
            if (bmi(num1, num2) >= 30.0)
                System.out.print("obese ");
        }
    }

    public static double bmi(int num1, double num2) {
        double bmi = 0;
        bmi = num1 / (num2 * num2);
        return bmi;
    }
}
