public class Solution {
    public static void main(String[] args) throws Exception {
        double[] nums1 = new double[]{353, 118, 386, 439, 66, 357, 166, 86, 293, 393, 98, 135, 140, 104, 209, 547, 181, 241, 545, 187, 445, 306, 163, 231, 549, 519, 385, 330, 138, 158, 511, 459, 245};
        int[] sum = new int[33];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = (int) Math.round((nums1[i] - 32) / 1.8);
            System.out.print(sum[i] + " ");
        }
    }
}
