package cz.educanet.praha;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Objects;

public class Cinema {

    public static int freeSpaces(String[] namesOnSeat, Scanner sc) {
        while (sc.hasNext()) {
            int index = getIndex(sc, namesOnSeat);
            String name = sc.next();
            namesOnSeat[index] = name;
        }
        return (int) Arrays.stream(namesOnSeat).filter(Objects::isNull).count();
    }

    private static int getIndex(Scanner sc, String[] seatNames) {
        int i;
        do {
            i = sc.nextInt();
            System.out.println(i);
        } while (i < 0 || i >= seatNames.length || seatNames[i] != null);
        return i;
    }

    public static void main(String[] args) {
        int freeSpaces = freeSpaces(new String[]{null, null, "2bad2furious", null, null, "monarezio"}, new Scanner(System.in));
        System.out.println("Free spaces: " + freeSpaces);
    }
}
