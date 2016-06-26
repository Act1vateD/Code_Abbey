public class Class {
    public static void main(String[] args) {
        double[] num = new double[]{18.3, 35.2, 32.6, 44.1, 61.0, 49.3, 50.8, 51.4, 49.2, 44.3, 26.7, 33.8, 15.9,
                25.0, 20.0, 11.9, 12.4, 11.0, 20.2, 10.7, 13.1, 10.3, 21.9, 25.4, 30.0, 35.3, 34.4, 44.6, 35.3,
                49.3, 57.7, 40.1, 32.8, 29.1, 40.1, 49.3, 30.0, 23.6, 21.9, 14.2, 21.0, 13.0, 10.0, 19.6, 12.5,
                6.6, 12.3, 26.9, 31.4, 23.1, 37.1, 43.9, 43.2, 61.4, 38.3, 50.2, 47.3, 40.2, 39.6, 35.3, 30.2,
                22.9, 20.6, 16.1, 10.9, 9.1, 10.2, 12.9, 12.7, 15.6, 6.7, 24.8, 24.2, 35.2, 39.8, 44.1, 47.6, 49.3,
                48.7, 49.0, 47.3, 44.1, 41.7, 36.1, 30.0, 27.5, 19.9, 1.7, 24.7, 12.6, 10.1, 10.8, 27.7, 14.4, 17.4,
                23.1, 30.0, 39.9, 26.3, 35.9, 44.2, 37.6, 50.0, 48.9, 47.4, 54.4, 46.1, 32.9, 29.9, 19.5, 20.1,
                26.4, 13.0, 10.1, 10.4, 2.7, 5.8, 4.2, 12.9, 15.9, 32.9, 36.3, 40.6, 47.1, 60.6, 56.4, 38.3, 49.3,
                48.7, 33.9, 40.1, 45.1, 22.6, 20.1, 18.6, 16.9, 4.7, 5.1, 20.6, 10.7, 11.5, 15.9, 20.0, 34.4, 36.8,
                27.8, 27.1, 59.1, 42.0, 43.5, 40.8, 59.5, 52.5, 45.9, 41.4, 39.5, 30.3, 27.2, 19.5, 15.5, 17.2,
                21.6, 8.8, 20.9, 5.6, 15.9, 20.4, 21.7};
        double res = 0;
        System.out.print(num[0] + " ");
        for (int i = 1; i < num.length - 1; i++) {
            res = (num[i - 1] + num[i] + num[i + 1]) / 3;
            System.out.print((Math.round(res * 10000000000L) / 10000000000.0000000000) + " ");
        }
        System.out.print(num[num.length - 1]);
    }
}
