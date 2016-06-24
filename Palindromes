public class Class {
    public static void main(String[] args) {
        String[] slova = new String[]{"Kleoolw Nhnw Lo, Oe-Lk",
                "Xp Ofau-Raeafue Unuiypuvupyiunueuf, aearuafop, X",
                "Udxlzaagqaqiy-Iqaqga az, l xd u",
                "Iox-Qyb, omahealu a seuyhftf, Gogftfhyuesaula Ehamobyq-xoi",
                "N Xyoavket-Kuet-Uxo-Ra-bjwi Iiiwj-Baroxu-t, Euk Tek-Vaoyxn",
                "Rhawdceyueunqivlwlv Iqnueuyecdwahr",
                "Bn Mituu, kc-cooeleelenoccku Ut, i mnb",
                "G, iiosogeyypexuxvna, Gz, yxwx Yzgani, Xuxepyyegosoiig",
                "Eieeeuoymbloldivywiqyyqi, wyvidlxlbm, youeeeie",
                "Aaqzi-die I-I Idiz, Qaa",
                "Nqoc, Yyomeyyljtifigefvywbllbwyvfegifitjlyyemoyycoq, N",
                "Aion-a-euscyy-xvu, ygieoeoeoeigy-u Vxyycsueano Ia",
                "Q-Xrof A, He, lu qihuhiqulehafor, x-q",
                "S-Cyxx Gwytuyu ycu-xajuwareh H erawu-jaxu, Cyuy ut-Ywgxxu cs",
                "Takuzueyahayeuz, Ukat",
                "Bnyyau, Gvsyzlajdaazya, hhayzaadjalzy, svguayynb",
                "Uiuveyey-yub-ee-b uyyeyevuiu"};

        for (int i = 0; i < slova.length; i++) {
            String str = slova[i].replaceAll("\\W", "").toLowerCase();
            char[] norm = str.toCharArray();
            int length = str.length();
            String ddd = "";
            for (int j = length - 1; j >= 0; j--) {
                ddd = ddd + str.charAt(j);
            }
            char[] rev = ddd.toCharArray();
            int no = 0;
            for (int k = 0; k < length; k++) {
                if (rev[k] != norm[k])
                    no++;
            }
            if (no > 0)
                System.out.print("N" + " ");
            else System.out.print("Y" + " ");
        }
    }
}
