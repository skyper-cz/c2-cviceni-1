package cz.educanet.praha;

import java.util.Scanner;

public class Cube {
    public static int sumOfAreasAndVolumes(Scanner scanner) {

        int objem = 0;
        int povrch = 0;

        while (scanner.hasNext()) {
            int promenna = scanner.nextInt();
            int Shield = 6 * promenna * promenna;
            povrch += Shield;
            int Cube = promenna * promenna * promenna;
            objem += Cube;
        }
        return povrch + objem;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAreasAndVolumes(new Scanner(System.in)));
    }
}
