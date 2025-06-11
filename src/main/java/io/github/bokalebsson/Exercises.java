package io.github.bokalebsson;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {

        /*Create a String with your first name as content. Print out the String
        object to the console.*/

        /*String firstName = "Bo";
        System.out.println(firstName);*/


        /*Create two Strings. One with your first name and the other with your
        last name. Print out both Strings to the console with a ” ” separating
        them.*/

        /*String firstName = "Bo";
        String lastName = "Kalebsson";
        System.out.println(firstName + " " + lastName);*/


       /* Create two variables with decimal values. Create a third decimal
        variable called result. Assign the sum of the two first variables to
        result.*/

        /*double number1 = 6.45;
        double number2 = 3.25;
        double result = number1 + number2;
        System.out.println(result);*/


        /*Create a class called Car. The class should contain the following
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

//            Method for printing out the information about the Car.
/*            public void printInfo() {
                System.out.println("Brand: " + brand);
                System.out.println("Registration Number: " + regNumber);
                System.out.println("Max speed: " + maxSpeed);
                System.out.println("Owner: " + owner);
                System.out.println("Color: " + color);
                System.out.println("Can park correctly: " + canParkCorrectly);
            }
        }*/

//        Instantiating the Car Class.
/*          Car carNumber1 = new Car();
            carNumber1.brand = "BMW";
            carNumber1.regNumber = "ABC 123";
            carNumber1.maxSpeed = 175;
            carNumber1.owner = "Adam Bengtsson";
            carNumber1.color = "Black";
            carNumber1.canParkCorrectly = false;

            carNumber1.printInfo();*/


        /* Make an integer called score and assign a value to it.
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

        /* Being a developer you need to learn how to search for information on
        the Internet. Open up a web browser and search for ”java input from
        user”. • Use your new knowledge to take a String as input from the user and store it in
        a String object.*/

/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Vad heter du? ");
        String name = scanner.nextLine();
        System.out.println(name);*/

        System.out.println("You are here!");

    }

}


