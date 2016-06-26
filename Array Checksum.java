public class Solution {
    public static void main(String[] args) throws Exception {
        int seed = 113;
        long result = 0;
        int limit = 10000007;

        int[] mas1 = new int[]{123, 4, 75568, 165079, 18198496, 6028442, 3569, 200, 32328, 13585, 32, 9266148, 32051273, 5244, 474410709, 269316048, 95547, 949270, 2723897, 57, 97046, 864286, 944, 9};
        for (int i = 0; i < mas1.length; i++) {
            result += mas1[i];
            result *= seed;
            result %= limit;
        }
        System.out.println(result);
    }
}
