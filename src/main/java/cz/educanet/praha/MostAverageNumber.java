package cz.educanet.praha;

import java.util.Scanner;

public class MostAverageNumber {

    static int findMostAverageNumber(Scanner sc) {
        int pocet;

        pocet = sc.nextInt();

        int[] cisla = new int[pocet];

        int soucet = 0;
        int nejblizsi = 0;

        for (int i = 0;i < cisla.length; i++) {
            int input = sc.nextInt();
            cisla[i] = input;
            soucet += input;
        }
        soucet /= cisla.length;


        for (Integer integer : cisla) {
            if (Math.abs(integer - soucet) <= Math.abs(nejblizsi - soucet)) {
                nejblizsi = integer;
            }
        }

        return nejblizsi;
    }
}
