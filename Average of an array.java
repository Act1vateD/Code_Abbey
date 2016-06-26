public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mas1 = new int[]{404, 52, 80, 107, 3, 217, 416, 164, 238, 205};
        int[] mas2 = new int[]{1984, 1532, 366, 546, 1911, 1018, 1615, 606};
        int[] mas3 = new int[]{393, 816, 332, 773, 406, 819, 908, 933, 65};
        int[] mas4 = new int[]{56, 226, 5, 164, 178, 87, 27, 24, 176, 159, 16, 112};
        int[] mas5 = new int[]{376, 300, 118, 679, 749, 450, 47, 540, 782, 820, 946, 576, 703};
        int[] mas6 = new int[]{1475, 3459, 3457, 990, 3525, 1983, 3826, 806, 2408, 106, 3617, 843, 352, 1300};
        int[] mas7 = new int[]{701, 302, 541, 356, 27};
        int[] mas8 = new int[]{566, 747, 198, 488, 299, 901, 317, 940, 245, 158, 780, 493, 15, 252, 425};
        int[] mas9 = new int[]{3608, 771, 320, 4312, 3370, 335, 7691};

        System.out.print(sum(mas1) + " ");
        System.out.print(sum(mas2) + " ");
        System.out.print(sum(mas3) + " ");
        System.out.print(sum(mas4) + " ");
        System.out.print(sum(mas5) + " ");
        System.out.print(sum(mas6) + " ");
        System.out.print(sum(mas7) + " ");
        System.out.print(sum(mas8) + " ");
        System.out.print(sum(mas9) + " ");
    }

    public static int sum(int[] mass) {
        int count = 0;
        double result = 0;
        for (int i = 0; i < mass.length; i++) {
            result += mass[i];
            count++;
        }

        return (int) (result / count + 0.5);
    }
}
