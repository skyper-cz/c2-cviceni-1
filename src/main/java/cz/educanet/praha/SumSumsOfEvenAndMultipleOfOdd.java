package cz.educanet.praha;

import java.util.Scanner;

public class SumSumsOfEvenAndMultipleOfOdd {



    public static int sumSumsOfEvenAndMultipleOfOdd(Scanner scanner) {
         int sudy = 0;
         int lichy = 0;

        while (scanner.hasNext()) {
            int mezicast = scanner.nextInt();
            if (mezicast % 2 == 0) {

                System.out.println("The given number " + mezicast + " is Even ");
                sudy += mezicast;

            } else {

                System.out.println("The given number " + mezicast + " is Odd ");
                if (lichy == 0) {
                    lichy = mezicast;
                }
                else {
                    lichy *= mezicast;
                }
            }
        }
        int vysledek = sudy + lichy;
        sudy = 0;
        lichy = 0;
        return vysledek;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number separated by a new line");
        System.out.println(sumSumsOfEvenAndMultipleOfOdd(sc));
    }
}
