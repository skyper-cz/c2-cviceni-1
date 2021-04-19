package cz.educanet.praha;

import java.util.Scanner;

public class PrintedSquare {
    public static String printSquare(int side) {
        String ctverec = "";

        for (int i = 0; i < side; i++) {
            if (i == 0 ) {
                for (int x = 0; x < side; x++) {
                    ctverec += "*";
                }
                ctverec += "\n";
            }
            else if (i == side - 1) {
                for (int x = 0; x < side; x++) {
                    ctverec += "*";
                }
            }
            else {
                ctverec += "*";
                for (int y = 1; y < side - 1;y++) {
                    ctverec += " ";
                }
                ctverec += "*\n";
            }

        }

        return ctverec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vložte stranu");
        String result = printSquare(sc.nextInt());
        System.out.println(result);
    }
}
