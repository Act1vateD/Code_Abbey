package Code_Abbey;

//  Pythagorean Theorem

public class Main4 {
    public static void main(String[] args) {
        int line1[] = {60, 560, 1470, 100, 645, 96, 60, 1368, 450, 1290, 624, 168, 696, 301, 1752, 15, 1512, 216, 42, 312};
        int line2[] = {32, 1050, 784, 75, 344, 40, 144, 399, 240, 688, 260, 126, 203, 1032, 511, 20, 441, 405, 144, 91};
        int hypotenuse[] = {61, 1069, 1771, 128, 731, 104, 156, 1464, 504, 1462, 676, 201, 736, 1077, 1757, 26, 1575, 472, 151, 334};
        char one = 'A';
        char two = 'R';
        char three = 'O';
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 0; i < line1.length; i++) {
            tmp1 = line1[i] * line1[i] + line2[i] * line2[i];
            tmp2 = hypotenuse[i] * hypotenuse[i];
            if (tmp1 == tmp2) {
                System.out.println(two);
            } else if (tmp1 < tmp2) {
                System.out.println(three);
            } else if (tmp1 > tmp2) {
                System.out.println(one);
            }
        }
    }
}
