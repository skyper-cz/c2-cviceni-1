package cz.educanet.praha;

import cz.educanet.praha.school.School;

public class SchoolCountStudentsFromClassByName {

    public static int countStudentsFromClassByItsName(School school, String className) {
        int pocetStudetu = 0;
        for (int i = 0; i < school.classes.length; i++) {
           if (className.equals(school.classes[i].name)) {
               pocetStudetu = school.classes[i].students.length;
           }
        }

        return pocetStudetu;
    }
}
