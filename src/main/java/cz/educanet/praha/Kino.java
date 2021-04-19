package cz.educanet.praha;

import java.util.Arrays;
import java.util.Scanner;

public class Kino {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        String[] kino = new String[9999];
        boolean pokracovat = true;

        while(pokracovat) {

            int index = 0;
            String Jmeno = "";
            System.out.println("Vložte Jméno zákazníka");
            Jmeno = sc1.nextLine();
            System.out.println("Vložte sedadlo");
            index = sc2.nextInt();

            if (kino[index - 1] == null) {
                kino[index - 1] = Jmeno;
            }
            else {
                System.out.println("Sedadlo je již zabráno nebo out of bounds");
            }
            System.out.println("chcete pokračovat");
            boolean pokracovat1;
            System.out.println("true/false");
            pokracovat1 = sc3.nextBoolean();
            if (pokracovat1) {
                pokracovat = true;
            }
            else {
                pokracovat = false;
            }
        }
        System.out.println(Arrays.toString(kino));
    }
}
