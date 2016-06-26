package Code_Abbey;


public class Main2 {
    public static void main(String[] args) {
        String[] str = {"ufvjwxobncodpjeliik", "lvapedhnpesfniuikjkz", "sfkqqohahebxaei", "ayqdvynidhmijie", "qwvytxpooowprribveadue", "thbiwwymmqadaoyofoyxwamu", "yzavncwvymneyifuiuonz", "anevimgbgbwtdmjuzxbs", "uajcutoftucifppgvru", "srcksuyydutmwhyfnt", "hylnvekisurexowmoppqcogk"};
        int[] num = {4, 3, 2, -4, -3, -8, -3, -5, 3, -1, -8};
        String name = "";
        String name1 = "";
        String res = "";
        String[] list = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 0) {
                name = str[i].substring(num[i]);
                name1 = str[i].substring(0, str[i].length() - (str[i].length() - num[i]));
                list[i] = name + name1;

            } else if (num[i] < 0) {
                name = str[i].substring(str[i].length() - Math.abs(num[i]));
                name1 = str[i].substring(0, str[i].length() - Math.abs(num[i]));
                list[i] = name + name1;
            }
            System.out.println(list[i]);
        }
    }
}
