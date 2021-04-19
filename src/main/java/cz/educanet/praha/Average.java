package cz.educanet.praha;

import java.util.Scanner;

public class Average {

    public static double average(Scanner scanner) {
        double soucet = 0;
        double prumer = 0;
        double pocet = 0;
        while (scanner.hasNext()) {
            double mezicast = scanner.nextDouble();
            pocet++;
            soucet += mezicast;
        }
        prumer = soucet / pocet ;
        return prumer;
    }

    public static void main(String[] args) {
        System.out.println(average(new Scanner(System.in)));
    }
}
