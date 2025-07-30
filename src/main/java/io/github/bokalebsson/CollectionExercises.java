package io.github.bokalebsson;

import java.time.DayOfWeek;
import java.util.*;

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

/*        Create a new list and populate it with the days of the week excluding THURSDAY. Lastly,
                insert the weekday THURSDAY into the right position in the list.*//*

        ArrayList<DayOfWeek> week = new ArrayList<>();

        // Iterate and add all days, except thursday, with for-each loop:
        for (DayOfWeek day : DayOfWeek.values()){
            if (day == DayOfWeek.THURSDAY) {
                continue;
            }
            week.add(day);
        }

        // List after the loop:
        System.out.println("The list, excluding thursday: \n" + week);

        // Find the index for friday:
        int index = week.indexOf(DayOfWeek.FRIDAY);

        // Add thursday to the correct spot in the list;
        week.add(index, DayOfWeek.THURSDAY);

        // The list after adding thursday on the correct spot:
        System.out.println("The list, including thursday: \n" + week);*/

/*        Create a new list and populate it with the days of the week. Then create a new list out of the
        first three elements of the first list using a subList.*//*

        // Create and fill a list with days of the week:
        ArrayList<DayOfWeek> week = new ArrayList<>();
        Collections.addAll(week, DayOfWeek.values());

        // Create a sublist with the three first elements from week and save it to a new list:
        List<DayOfWeek> firstThree = new ArrayList<>(week.subList(0,3));

        // Print the list:
        System.out.println("The three first elements: \n" + firstThree);*/

/*        Create a new hashset and populate it with the days of the week. Lastly, print the set out and
        pay attention to the order of the elements.*//*

        // Create and fill a set with days of the week:
        HashSet<DayOfWeek> week = new HashSet<>();
        Collections.addAll(week, DayOfWeek.values());

        // Print out the set:
        System.out.println("The filled set: " + week);*/

/*        Create a new hashSet and populate it with the days of the week. Then convert the hashSet to
        an arrayList.*//*

        // Create and fill a set with days of the week:
        Set<DayOfWeek> week = new HashSet<>();
        Collections.addAll(week, DayOfWeek.values());

        // Print out the set:
        System.out.println("The set: \n" + week);

        List<DayOfWeek> converted = new ArrayList<>(week);

        // Print out the list:
        System.out.println("The converted list: \n" + converted);*/

/*        Create a new hashSet and populate it with random names. Then convert the hashSet to an
        arrayList. Lastly, manually sort the list in alphabetical order and print it out.*//*

        // Create and fill a set with some random names:
        Set<String> names = new HashSet<>();
        names.add("Jonas");
        names.add("Fredrik");
        names.add("Jessica");
        names.add("Elin");
        names.add("Malin");

        // Print the set:
        System.out.println("The set: \n" + names);

        // Convert set to list:
        List<String> converted = new ArrayList<>(names);

        // Sort the list:
        Collections.sort(converted);

        // Print the list:
        System.out.println("The sorted list: \n" + converted);*/

/*        Create a new hashSet and populate it with random names. Lasty, sort the names in
        alphabetical order using only a Set or a child of Set.*//*

        // Create a hashSet and fill it with some random names:
        // You could have skipped the conversion by just declaring a TreeSet here.
        Set<String> hashSetNames = new HashSet<>();
        hashSetNames.add("Jonas");
        hashSetNames.add("Fredrik");
        hashSetNames.add("Jessica");
        hashSetNames.add("Elin");
        hashSetNames.add("Malin");

        // Convert to TreeSet from HashSet:
        TreeSet<String> sortedNames = new TreeSet<>(hashSetNames);

        // Print out the sorted TreeSet:
        System.out.println(sortedNames);*/

    }
}
