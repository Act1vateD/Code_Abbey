package Code_Abbey;

//  Bicycle Race

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main3 {
    public static void main(String[] args) {
        int bicycle1[] = {26, 28, 18, 14, 25, 29, 26, 16, 10, 12, 23, 10, 16, 10, 13, 30, 17, 21, 19, 17};
        int bicycle2[] = {26, 10, 11, 26, 20, 26, 15, 14, 11, 21, 15, 26, 14, 29, 25, 15, 30, 14, 21, 18};
        double road[] = {145, 12, 13, 40, 21, 289, 13, 64, 10, 58, 38, 111, 51, 14, 28, 21, 128, 234, 108, 13};
        double[] res = new double[road.length];
        double tmp = 0;
        for (int i = 0; i < road.length; i++) {
            tmp = road[i] / (bicycle1[i] + bicycle2[i]);
            res[i] = tmp * bicycle1[i];
            res[i] = new BigDecimal(res[i]).setScale(11, RoundingMode.HALF_UP).doubleValue();
            System.out.println(res[i]);
        }
    }
  }
