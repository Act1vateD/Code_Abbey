public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mas = new int[]{2846, 48441, 5189, 21, 342, 7863, 472, 21, 3196, 27, 1530, 2139, 449, 4366, 35782, 23023, 462};
        for (int x : mas) {
            System.out.print(counts(x) + " ");
        }
    }

    public static int counts(int x) {
        int counts = 0;
        do {
            counts++;
            if (x % 2 == 0)
                x /= 2;
            else
                x = 3 * x + 1;
        } while (x != 1);
        return counts;
    }
}
