public class Class {
    public static void main(String[] args) {
        int[] mas1 = {24, 18, 21, 51, 25, 0, 35, 15};
        int[] mas2 = {4, 4, 12, 51, 7, 16, 11, 30};
        int[] mas3 = {14, 8, 24, 41, 29, 15, 30, 18};
        int[] mas4 = {0, 11, 0, 1, 25, 20, 35, 9};
        int[] mas5 = {10, 22, 38, 38, 19, 2, 57, 41};
        int[] mas6 = {4, 12, 55, 27, 19, 17, 56, 14};
        int[] mas7 = {20, 23, 29, 10, 29, 11, 7, 32};
        int[] mas8 = {15, 13, 7, 31, 21, 8, 3, 48};
        int[] mas9 = {16, 6, 56, 21, 25, 23, 9, 19};
        int[] mas10 = {9, 4, 34, 12, 24, 19, 47, 44};
        int[] mas11 = {0, 7, 48, 37, 12, 2, 40, 52};
        int[] mas12 = {20, 1, 12, 15, 26, 15, 20, 43};
        System.out.print(result(mas1) + " " + result(mas2) + " " + result(mas3) + " " + result(mas4) + " " + result(mas5) + " " + result(mas6)
                + " " + result(mas7) + " " + result(mas8) + " " + result(mas9) + " " + result(mas10) + " " + result(mas11) + " " + result(mas12));
    }
    
    public static String result(int[] mas) {

        int[] masres = new int[4];
        int tmp = 0;
        int resMod = 0;
        int resDiv = 0;
        String str = "(";

        tmp = (((mas[4] * 24) * 60 * 60) + (mas[5] * 60 * 60) + (mas[6] * 60) + mas[7]) -
                (((mas[0] * 24) * 60 * 60) + (mas[1] * 60 * 60) + (mas[2] * 60) + mas[3]);

        resMod = tmp % 60;
        resDiv = tmp / 60;
        masres[3] = resMod;
        resMod = resDiv % 60;
        resDiv /= 60;
        masres[2] = resMod;
        resMod = resDiv % 24;
        resDiv /= 24;
        masres[1] = resMod;
        resMod = resDiv % 60;
        masres[0] = resMod;
        str += ((Integer.toString(masres[0])) + " " + (Integer.toString(masres[1])) + " " + (Integer.toString(masres[2])) + " " + (Integer.toString(masres[3])) + ")");

        return str;
    }
}
