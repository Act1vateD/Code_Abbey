public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mas = new int[]{3, 9, 7, 5, 8, 10, 19, 17, 16, 18, 13, 2, 15, 12, 4, 1, 11, 20, 14, 6};
        int swapcount = 0;
        int loopcount = 0;
        int tmp = 0;
        int tmp1 = 0;
        for (int k = 0; k < mas.length; k++) {
            for (int j = 1; j < (mas.length - k); j++) {
                if (mas[j - 1] > mas[j]) {
                    tmp = mas[j - 1];
                    mas[j - 1] = mas[j];
                    mas[j] = tmp;
                    swapcount++;
                }
            }
            if (tmp1 != swapcount) {
                tmp1 = swapcount;
                loopcount++;
            } else
                break;
        }
        System.out.println(loopcount + 1 + " " + swapcount);
    }

    // 17 84
//    public static void swap(int[] mas, int index) {
//        int tmp = mas[index - 1];
//        mas[index - 1] = mas[index];
//        mas[index] = tmp;
//    }
}
