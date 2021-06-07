package cz.educanet.praha;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Cinema {

    public static int freeSpaces(String[] namesOnSeat, Scanner sc) {
        int vysledek = 0;
        while (sc.hasNext()) {
            int index = sc.nextInt();
            if (index >= 0 && index < namesOnSeat.length) {
                if (namesOnSeat[index] == null){
                    namesOnSeat[index] = sc.next();
                }
            }

        }
        for (int i = 0; i < namesOnSeat.length;i++) {
            if (namesOnSeat[i] == null) {
                vysledek++;
            }
        }
        return vysledek;
    }

    public static void main(String[] args) {
        int freeSpaces = freeSpaces(new String[]{null, null, "2bad2furious", null, null, "monarezio"}, new Scanner(System.in));
        System.out.println("Free spaces: " + freeSpaces);
    }
}
