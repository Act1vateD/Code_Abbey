public class Class {
    public static void main(String[] args) {
        int[] mas1 = {2, 7600, 1128, 480, 8036, 64, 629, 10, 4, 5648, 184, 6175, 9800, 434, 1032, 226, 6026, 912, 2225, 10};
        int[] mas2 = {37, 40, 8554, 800, 6478, 5, 2812, 6, 6, 2, 3043, 3445, 5500, 378, 2136, 378, 9, 2584, 2450, 620};
        for (int i = 0; i < mas1.length; i++) {
            int nok = (mas1[i] * mas2[i]) / NOD(mas1[i], mas2[i]);
            System.out.print("(" + NOD(mas1[i], mas2[i]) + " " + nok + ")" + " ");
        }
    }

    static int NOD(int mas1, int mas2) {
        int min;
        int nod = 0;
        if (mas1 > mas2)
            min = mas2;
        else
            min = mas1;
        for (int count = 1; count <= min; count++) {
            if (mas2 % count == 0 && mas1 % count == 0) {
                if (count > nod)
                    nod = count;
            }
        }
        return nod;
    }
}
