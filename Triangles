public class Solution {
    public static void main(String[] args) throws Exception {
        int[] nums1 = new int[]{355, 1496, 524, 446, 355, 634, 896, 154, 721, 382, 1584, 420, 1427, 1188, 645, 1081, 1515, 1451, 903, 1428, 242, 463, 411, 916};
        int[] nums2 = new int[]{1380, 3595, 1075, 1457, 1079, 1895, 2959, 232, 2433, 215, 799, 492, 3018, 396, 1742, 399, 853, 1595, 894, 706, 143, 535, 588, 1650};
        int[] nums3 = new int[]{663, 911, 469, 735, 490, 1146, 1728, 311, 1014, 500, 852, 660, 851, 543, 806, 665, 648, 943, 894, 361, 519, 1253, 599, 2023};
        int[] sum = new int[24];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = check(nums1[i], nums2[i], nums3[i]);
            System.out.print(sum[i] + " ");
        }
    }

    public static int check(int a, int b, int c) {
        if ((a + b) < c || (a + c) < b || (b + c) < a)
            return 0;
        else return 1;
    }
}
