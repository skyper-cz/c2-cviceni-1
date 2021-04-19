package cz.educanet.praha;

import java.util.Scanner;

public class SumAllNumbers {

    public static int calculate(Scanner scanner) {
        int vysledek = 0;

        while (scanner.hasNext()) {
            vysledek += scanner.nextInt();
        }
        return vysledek;
    }

    public static void main(String[] args) {
        System.out.println(calculate(new Scanner(System.in)));
    }
}
