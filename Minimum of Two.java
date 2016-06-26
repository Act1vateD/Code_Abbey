public class Solution {
    public static void main(String[] args) throws Exception {
        Integer[] nums1 = new Integer[]{2938674, 928321, 9590042, 7539045, -9325356, -3993509, -7289799, -5032744, -669653, 1025486, -1819991, -8445640, 8946826, -9407543, 3409662, -292689, 7690060, 638563, -2203491, -7345788, -4931673, -499130, -9826159};
        Integer[] nums2 = new Integer[]{606693, -5709774, -2839123, -4625891, 6890719, -8970283, 1513138, -6115065, 5357060, 2041692, 732274, 5464114, 6889724, -6132859, -2916632, -3651663, -9364367, 728010, -1822392, -1528847, -1339297, -2221473, 4468125};
        Integer[] sum = new Integer[23];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = minimum(nums1[i], nums2[i]);
            System.out.print(sum[i] + " ");
        }
    }

    private static int minimum(Integer nums1, Integer nums2) {
        if (nums1 < nums2)
            return nums1;
        else
            return nums2;
    }
}
