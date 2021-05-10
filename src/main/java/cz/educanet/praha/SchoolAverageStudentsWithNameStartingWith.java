package cz.educanet.praha;

import cz.educanet.praha.school.School;

import java.util.ArrayList;

public class SchoolAverageStudentsWithNameStartingWith {
    public static double averageAgeOfStudentsWithNameStartingWith(School s, char startsWith) {
        int prumernyVek = 0;
        int celkovyVek = 0;
        int pocetStudetu = 0;
        for (int i = 0; i < s.classes.length; i++) {
            for (int x = 0;x < s.classes[i].students.length; x++) {
                String jmeno = s.classes[i].students[x].name;
                if (startsWith == jmeno.charAt(0)) {
                    celkovyVek += s.classes[i].students[x].age;
                   pocetStudetu++;
                }
            }
        }
        prumernyVek = celkovyVek/pocetStudetu;
        return prumernyVek;
    }
}
