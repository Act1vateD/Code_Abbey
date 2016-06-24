import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] num1 = new int[]{9, 48, 24, 561, 18, 9, 3, 5, 775, 731, 1439, 13, 863, 812, 77, 28, 1097, 1132, 663, 504, 27, 1696, 166, 186, 84};
        int[] num2 = new int[]{704, 10, 3, 663, 12, 390, 541, 686, 5, 737, 1500, 19, 867, 817, 148, 621, 997, 1037, 721, 540, 794, 82, 83, 105, 36};
        int[] num3 = new int[]{5, 116, 78, 579, 9, 473, 1045, 682, 765, 286, 890, 8, 1286, 730, 8, 1533, 1005, 97, 672, 450, 799, 907, 168, 12, 10};
        int[] tmp = new int[3];
        for (int i = 0; i < num1.length; i++) {
            tmp[0] = num1[i];
            tmp[1] = num2[i];
            tmp[2] = num3[i];
            System.out.print(mid(tmp) + " ");
        }
    }

    public static int mid(int[] tmp) {
        Arrays.sort(tmp);
        int middle = tmp.length / 2;
        if (tmp.length % 2 == 1) {
            return tmp[middle];
        } else {
            return tmp[middle - 1] + tmp[middle] / 2;
        }
    }
}
