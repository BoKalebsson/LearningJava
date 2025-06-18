package io.github.bokalebsson;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;

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


/*        Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the
        month and print it out.*/

/*        LocalDate currentDate = LocalDate.now();

        LocalDate futureDate = currentDate.plusYears(10).minusMonths(10);

        System.out.println(futureDate.getMonth());*/


/*      Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and
        the date from exercise 5. Print out the elapsed years, months and days.*/

/*        LocalDate myBirthDay = LocalDate.parse("1983-09-06");

        LocalDate currentDate = LocalDate.now();

        LocalDate futureDate = currentDate.plusYears(10).minusMonths(10);

        Period period = Period.between(myBirthDay, futureDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Years between my birthday and the future-date: ");
        System.out.println(years + " years, " + months + " months, " + days + " days.");*/


/*        Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add
        the period you created to the current date.*/

/*        Period period = Period.of(4,7,29);
        LocalDate currentDate = LocalDate.now();
        System.out.println("Future date: " + currentDate.plus(period));*/


/*      Create a LocalTime object of the current time.*/

/*        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);*/


/*      Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.*/

/*        LocalTime currentTime = LocalTime.now();
        int nanoSeconds = currentTime.getNano();
        System.out.println("Nano seconds: " + nanoSeconds);*/


/*        Create a LocalTime object from a String using the .parse() method.*/

/*        LocalTime time = LocalTime.parse("14:23:57");
        System.out.println("Time = " + time);*/


/*        Using DateTimeFormatter format LocalTime from current time and print it out as following pattern:
        10:32:53*/

/*        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time formated: " + currentTime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));*/


/*        Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00*/

/*        LocalDateTime chosenDateTime = LocalDateTime.of(2018, 4, 5, 10, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'date:' yyyy-MM-dd 'time:' HH.mm");
        System.out.println(chosenDateTime.format(formatter));*/


/*        Using DateTimeFormatter format the LocalDateTime object from exercise 13 to a String that should
        look like this: torsdag 5 april 10:00.*/

/*        LocalDateTime chosenDateTime = LocalDateTime.of(2018, 4, 5, 10, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee d MMMM HH:mm");
        System.out.println(chosenDateTime.format(formatter));*/

/*        Create a LocalDateTime object by combining LocalDate object and LocalTime object.*/

/*        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.of(currentDate,currentTime);
        System.out.println("Combined Date and Time: " + currentDateTime);*/


/*        Create a LocalDateTime object. Then get the LocalDate and LocalTime components into separate
        objects of respective types from the LocalDateTime object.*/

/*        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime = " + currentDateTime);
        LocalDate currentDate = currentDateTime.toLocalDate();
        System.out.println("Current Date from LocalDateTime: " + currentDate);
        LocalTime currentTime = currentDateTime.toLocalTime();
        System.out.println("Current Time from LocalDateTime: " + currentTime);*/


/*        Create your own calendar for the year 2018.*/
/*
        // The start and end-date of the year.
        LocalDate startDate = LocalDate.of(2018,1,1);
        LocalDate endDate = LocalDate.of(2018,12,31);

        LocalDate currentDate = startDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd (EEEE)");

        // The loop will continue as long as currentDate is not after the endDate.
        while (!currentDate.isAfter(endDate)) {
            if (currentDate.getDayOfMonth() == 1) {
                System.out.println("\n==== " + currentDate.getMonth() + " ====");
            }
            System.out.println(currentDate.format(formatter));
            currentDate = currentDate.plusDays(1);
        }*/


    }
}
