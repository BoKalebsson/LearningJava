package io.github.bokalebsson;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {

/*      Create a String with your first name as content. Print out the String
        object to the console.*/

        /*String firstName = "Bo";
        System.out.println(firstName);*/


/*      Create two Strings. One with your first name and the other with your
        last name. Print out both Strings to the console with a ” ” separating
        them.*/

        /*String firstName = "Bo";
        String lastName = "Kalebsson";
        System.out.println(firstName + " " + lastName);*/


/*      Create two variables with decimal values. Create a third decimal
        variable called result. Assign the sum of the two first variables to
        result.*/

        /*double number1 = 6.45;
        double number2 = 3.25;
        double result = number1 + number2;
        System.out.println(result);*/


/*      Create a class called Car. The class should contain the following
        information. Car brand, registration number, max speed, owner name
        and one more attribute of your choice. Instantiate an Object of the
        class and assign values to the object. */

/*        class Car {
            String brand;
            String regNumber;
            int maxSpeed;
            String owner;
            String color;
            boolean canParkCorrectly;*/


/*          public void printInfo() {
                System.out.println("Brand: " + brand);
                System.out.println("Registration Number: " + regNumber);
                System.out.println("Max speed: " + maxSpeed);
                System.out.println("Owner: " + owner);
                System.out.println("Color: " + color);
                System.out.println("Can park correctly: " + canParkCorrectly);
            }
        }*/


/*          Car carNumber1 = new Car();
            carNumber1.brand = "BMW";
            carNumber1.regNumber = "ABC 123";
            carNumber1.maxSpeed = 175;
            carNumber1.owner = "Adam Bengtsson";
            carNumber1.color = "Black";
            carNumber1.canParkCorrectly = false;

            carNumber1.printInfo();*/


/*      Make an integer called score and assign a value to it.
        Create an if-statement that should print out ”Hurray, You passed!” if the score is above or equals to 65.
        If the score is Equal or between 55 and 64 it should print ”You are almost there.”
        If score is below 55 it should print ”Sorry, You did not pass.”*/

/*          int score = 69;
            if (score >= 65){
                System.out.println("Hurray, You passed!");
            }else if (score >= 55 && score <=64){
                System.out.println("You are almost there.");
            }else {
                System.out.println("Sorry, You did not pass.");
            }*/


/*      Being a developer you need to learn how to search for information on
        the Internet. Open up a web browser and search for ”java input from
        user”. • Use your new knowledge to take a String as input from the user and store it in
        a String object.*/

/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Vad heter du? ");
        String name = scanner.nextLine();
        System.out.println(name);*/


/*      Write a Java program to print 'Hello' on screen and then print your name on
        a separate line.
        Expected result:
        Hello
        Ali!*/

/*        String yourName = "Bo Kalebsson";
        System.out.println("Hello");
        System.out.println(yourName + "!");*/


/*        Create a program that takes a year as input from user and print if it’s leap
        year or not.*/

/*        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a leap year.");
                    } else {
                        System.out.println(year + " is not a leap year.");
                    }
                } else {
                    System.out.println(year + " is a leap year.");
                }
            } else {
                System.out.println(year + " is not a leap year.");
            }

            scanner.close();*/


/*      Write a Java program to print the sum/multiplication/division and
        subtraction of two numbers
        Expected result:
        45 + 11 = 56
        12 * 4 = 48
        24 / 6 = 4
        55 – 12 = 43*/

/*        int number1 = 69;
        int number2 = 5;

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        if (number2 != 0) {
            double result = (double) number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        } else {
            System.out.println("Division by 0 is not allowed.");
        }

        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));*/


/*      Write a Java program that prints the average of three numbers
        Expected result:
        (23 + 11 + 77) / 3 = 37*/

/*        int number1 = 23;
        int number2 = 11;
        int number3 = 77;
        int average = ((number1 + number2 + number3) / 3);

        System.out.println(number1 + " + " + number2 + " + " + number3 + " / 3 = " +average);*/


/*      Create a program that asks user to input his/her name and store it in a
        variable instead of having fixed name. Then print ‘Hello username’ where
        username is what you got from user as input.*/

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = scanner.nextLine().trim();
        System.out.println("Hello " + username);*/


/*        Create a program that asks user to input two numbers and print the
        sum/multiplication/division and subtraction of given numbers*/

    }
}