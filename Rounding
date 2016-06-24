public class Solution {
    public static void main(String[] args) throws Exception {
        double[] nums1 = new double[]{1280099, 6374947, 4005, 2040547, -6962084, 4489, -3130464, 14923, 8835669, 4956365, 12549, 7735527, 5313456, 14059, 1601852};
        double[] nums2 = new double[]{606, 827, 1456, 379, -1376636, 978, -3474068, 452, 5747, 828, 1776, 457, 457, 1316, 724};
        int[] sum = new int[15];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = (int) Math.round(fix(nums1[i], nums2[i]));
            System.out.print(sum[i] + " ");
        }
    }

    private static double fix(double nums1, double nums2) {
        double res = (nums1 / nums2);
        return res;
    }
}
