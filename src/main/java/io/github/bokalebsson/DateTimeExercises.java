package io.github.bokalebsson;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeExercises {

    public static void main(String[] args) {

/*        Create a LocalDate of the current day and print it out.*/

/*        LocalDate currentDate = LocalDate.now();
        System.out.println("CurrentDate = " + currentDate);*/


/*        Create a LocalDate of the current day and print it out in the following pattern using
        DateTimeFormatter: Torsdag 29 mars.*/

/*        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("eeee dd MMM"));
        System.out.println("Today is = " + today);*/


/*        Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO
        format.*/

/*        LocalDate today = LocalDate.now();

        // Check how the date should be formated in the assignment.
        System.out.println("\nISO Date Format: \n" + today.format(DateTimeFormatter.ISO_DATE)+"\n");

        // The numerical value of how many days ago was last monday.
        int daysBack = today.getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue();

        // The date of last monday.
        LocalDate lastMonday = today.minusDays(daysBack);

        // For-loop to loop through the week.
        System.out.println("Loop over the week, from last monday: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(lastMonday.plusDays(i));
        }*/


/*        Create a LocalDate object from a String by using the .parse() method.*/

/*        LocalDate date = LocalDate.parse("2025-06-17");
        System.out.println("Date = " + date);*/


/*      The date time api provides enums for time units such as day and month.
        Create a LocalDate of your birthday and extract the day of week for that date.
        Ex. 1945-05-08 -> TUESDAY*/

/*        // Parse the birthday to a LocalDate.
        LocalDate myBirthDay = LocalDate.parse("1983-09-06");

        // Solve what day of the week the birthday is.
        DayOfWeek dayOfWeek = myBirthDay.getDayOfWeek();

        // Prints out what day, with standard formating.
        System.out.println("Day of Week = " + dayOfWeek);

        *//*Prints out what day, with substring formating toUpperCase on first letter,
        rest toLowerCase.*//*
        System.out.println("Day of Week = " + dayOfWeek.toString().substring(0,1).toUpperCase() +
                dayOfWeek.toString().substring(1).toLowerCase());*/


    }
}
