package cz.educanet.praha;

import cz.educanet.praha.school.School;
import cz.educanet.praha.school.Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SchoolCountAllStudents {

    public static int countAllStudents(School school) {
        int PocetStudentu = 0;
        for (int i = 0; i < school.classes.length; i++) {
            PocetStudentu += school.classes[i].students.length;
        }
        return PocetStudentu;
    }

}
