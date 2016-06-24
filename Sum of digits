public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mas1 = new int[]{382, 331, 299, 327, 100, 208, 88, 130, 83, 271};
        int[] mas2 = new int[]{107, 279, 34, 180, 271, 76, 87, 98, 48, 156};
        int[] mas3 = new int[]{29, 61, 23, 187, 86, 15, 26, 173, 95, 134};
        int[] number = new int[mas1.length];
        for (int i = 0; i < mas1.length; i++) {
            number[i] = module(mas1[i], mas2[i], mas3[i]);
            int res = number[i];
            System.out.print(sum(res) + " ");
        }
    }

    public static int module(int num1, int num2, int num3) {
        int res = num1 * num2 + num3;
        return res;
    }

    public static int sum(int rrr) {
        int result = 0;
        int tmp = 0;
        int tmp1 = 0;
        while (rrr > 0) {
            tmp = rrr % 10;
            tmp1 = rrr / 10;
            result += tmp;
            rrr = tmp1;
            if (rrr < 0) break;
        }
        return result;
    }
}
