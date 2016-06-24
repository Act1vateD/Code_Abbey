public class Solution {
    public static void main(String[] args) throws Exception {
        Integer[] nums1 = new Integer[]{4698148, 1828862, -5693313, 7329673, -4328740, -3681360, 6741617, 557871, 9184967, 4937538, -5971230,
                4523027, 3103417, -1168962, -3310377, 2835444, 9251825, -6492298, 3632283, -5971868, 6734056, -9557371, -5857787, -3116804, -5210231};
        Integer[] nums2 = new Integer[]{1002649, 9991011, 9041398, 5165590, 6932908, -9116934, 8370694, -508937, 9757758, -7784841, 6913307,
                -1257831, 3048855, 378529, 6049788, -7631572, 9110044, -332084, -1147116, -6209578, -2180808, -7657780, 5445636, -5723325, 966297};
        Integer[] nums3 = new Integer[]{494257, 8580390, 5727620, 7858584, -3854178, -3583619, -5744123, 124582, 395848, 2705924, -6291427,
                -6300415, -7259017, 7906572, 4839481, 5722547, 4093241, -6415695, -6657936, -4442778, -7529470, 1212699, -5738445, 4640083, 689871};
        Integer[] sum = new Integer[25];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = minimum(nums1[i], nums2[i], nums3[i]);
            System.out.print(sum[i] + " ");
        }
    }

    private static int minimum(Integer nums1, Integer nums2, Integer nums3) {
        if (nums1 < nums2 && nums1 < nums3)
            return nums1;
        else if (nums2 < nums1 && nums2 < nums3)
            return nums2;
        else return nums3;
    }
}
