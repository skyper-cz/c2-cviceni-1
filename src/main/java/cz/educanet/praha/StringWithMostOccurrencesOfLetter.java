package cz.educanet.praha;

public class StringWithMostOccurrencesOfLetter {

    public static String findStringWithMostOccurrencesOfLetter(String[] strings, char letter) {
        int pocetznaku = 0;
        String hledane = "";

        for (int i = 0; i < strings.length; i++) {
            String pomocna = strings[i];
            int pocetvdanemslove = 0;
            for (int x = 0; x < pomocna.length(); x++) {
                if (pomocna.charAt(x) == letter) {
                    pocetvdanemslove++;
                }

            }
            if (pocetvdanemslove > pocetznaku) {
                hledane = strings[i];
                pocetznaku = pocetvdanemslove;
            }
        }

        return hledane;
    }
}
