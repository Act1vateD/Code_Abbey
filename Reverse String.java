public class Solution {
    public static void main(String[] args) throws Exception {
        String s = "supper till simple incandescent yield emperor interrogative";
        char[] str = s.toCharArray();
        char[] reverse = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            reverse[i] = str[(str.length - 1) - i];
            System.out.print(reverse[i]);
        }
    }
}
