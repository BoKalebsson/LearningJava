package io.github.bokalebsson;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionExercises {

    public static void main(String[] args) {

/*        *//* Create a new list and populate it with the days of the week. Lastly, print the out the list.*//*

        ArrayList<DayOfWeek> week2 = new ArrayList<>();

        // Add all the values from the enum-collection to our list:
        Collections.addAll(week2, DayOfWeek.values());

        System.out.println("-- Days of the week with collection method --");
        System.out.println(week2);*/

/*        *//*Create a new list and populate it with the days of the week. Lastly, iterate through the list
        and print out each element separately.*//*

        ArrayList<DayOfWeek> week = new ArrayList<>();

        // Iterate and add all days with for-each loop:
        for (DayOfWeek day : DayOfWeek.values()){
            week.add(day);
        }

        // Iterate through each day with for-each loop:
        System.out.println("-- Days of the week with for each-loop --");
        for (DayOfWeek day : week){
            System.out.println(day);
        }*/




    }
}
