public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mas1 = new int[]{467662, 22836, 118, 167, 71763, 21880, 432074, 3, 109541146, 3278, 544306, 12471262, 31617, 94690, 15192671, 446091340, 2001, 9627662, 527438741, 127, 101903, 385243, 87, 15223679, 18718, 10571438, 80878, 1142983, 109989, 2943511, 1471, 11352826};
        for (int x : mas1) {
            System.out.print(sum(x) + " ");
        }
    }

    public static int sum(int x) {
        int count = 1;
        int result = 0;
        String str = Integer.toString(x);
        char[] nums = str.toCharArray();
        for (int i = 0; i < nums.length; i++) {
            result += Character.getNumericValue(nums[i]) * count;
            count++;
        }
        return result;
    }
}
