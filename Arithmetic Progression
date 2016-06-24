public class Solution {
    public static void main(String[] args) throws Exception {
        int[] nums1 = new int[]{23, 14, 14, 5, 12, 2, 29, 11, 6, 12, 5};
        int[] nums2 = new int[]{17, 14, 13, 14, 17, 13, 6, 1, 15, 10, 5};
        int[] nums3 = new int[]{65, 55, 49, 48, 45, 34, 50, 71, 76, 29, 15};
        int[] sum = new int[11];
        for (int i = 0; i < sum.length; i++) {
           int an = nums1[i] + (nums3[i] - 1) * nums2[i];
            sum[i] = nums3[i] * (nums1[i] + an) / 2;
            System.out.print(sum[i] + " ");
        }
    }
}
