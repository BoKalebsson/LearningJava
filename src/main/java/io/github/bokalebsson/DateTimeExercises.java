package io.github.bokalebsson;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeExercises {

    public static void main(String[] args) {

        /*Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO
        format.*/
/*        LocalDate today = LocalDate.now();

        // Check how the date should be formated in the assignment.
        System.out.println("ISO Date Format: \n" + today.format(DateTimeFormatter.ISO_DATE)+"\n");

        // The numerical value of how many days ago was last monday.
        int daysBack = today.getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue();

        // The date of last monday.
        LocalDate lastMonday = today.minusDays(daysBack);

        // For-loop to loop through the week.
        System.out.println("Loop over the week, from last monday: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(lastMonday.plusDays(i));
        }*/



    }
}
