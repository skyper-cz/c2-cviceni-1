package cz.educanet.praha;

import java.util.ArrayList;
import java.util.Scanner;

public class MostAverageNumber {

    static int findMostAverageNumber(Scanner sc) {
        ArrayList<Integer> cisla = new ArrayList<>();
        int soucet = 0;
        int nejblizsi = 0;
        while (sc.hasNext()) {
            int input = sc.nextInt();
            cisla.add(input);
            soucet += input;
        }
        soucet /= cisla.size();


        for (Integer integer : cisla) {
            if (Math.abs(integer - soucet) <= Math.abs(nejblizsi - soucet)) {
                nejblizsi = integer;
            }
        }

        return nejblizsi;
    }
}
