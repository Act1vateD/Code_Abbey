import java.util.ArrayList;

public class Class1 {
    public static void main(String[] args) {
        int[] mas = new int[]{9251, 843, 3779, 8459, 1687, 1532, 3017, 1661, 5345, 4587, 680};
        for (int i = 0; i < mas.length; i++) {
            System.out.print(counts(mas[i]) + " ");
        }
    }

    public static int counts(int num) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            list.add(num);
            num = num * num;
            num = (num / 100) % 10000;
            count++;
            for (int x : list)
                if (num == x)
                    return count;
        }
    }
}
