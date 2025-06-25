package io.github.bokalebsson;

import java.util.*;

public class ArrayExercises {

    public static void main(String[] args) {

/*        Write a program which will store elements in an array of type ‘int’ and
        print it out. Expected output: 11 23 39 etc.*/

/*        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }*/


/*        Create a program and create a method with name ‘indexOf’ which will
        find and return the index of an element in the array. If the element
        doesn’t exist your method should return -1 as value.
        Expected output: Index position of number 5 is: 2.*/

/*        int[] numbers = {2, 7, 4, 5, 1, 9, 6};
        int number = 3;
        int index = indexOf(numbers, number);
        System.out.println("Index position of number " + number + " is: " + index);



    public static int indexOf(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }*/


/*        Write a program which will sort string array.
        Expected output: String array: [Paris, London, New York, Stockholm]
        Sort string array: [London, New York, Paris, Stockholm]*/

/*        String[] cities = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("String array: " + Arrays.toString(cities));
        Arrays.sort(cities);
        System.out.println("Sorted String array: " + Arrays.toString(cities));*/


/*        Write a program which will copy the elements of one array into another
        array. Expected output: Elements from first array: 1 15 20
        Elements from second array: 1 15 20*/

/*        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = Arrays.copyOf(array1, array1.length);
        System.out.println("Elements from first array: " +Arrays.toString(array1));
        System.out.println("Elements from second array: " +Arrays.toString(array2));*/


/*        Create a two-dimensional string array [2][2]. Assign values to the
        2-dimensional array containing any Country and City.
        Expected output: France Paris
        Sweden Stockholm*/

/*        String[][] countryCity = new String [2][2];
        countryCity[0][0] = "France";
        countryCity[0][1] = "Paris";
        countryCity[1][0] = "Sweden";
        countryCity[1][1] = "Stockholm";

        for(int i=0; i<countryCity.length; i++) {
            for(int j=0; j<countryCity[i].length; j++) {
                System.out.print(countryCity[i][j] + " ");

                if(j == countryCity[i].length -1) {
                    System.out.println();
                }
            }
        }*/


/*        Write a program which will set up an array to hold the next values in this
        order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
                Expected output: Average is: 17.3*/

/*        int[] numbers = {43, 5, 23, 17, 2, 14};
        int arrayLength = numbers.length;
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / arrayLength;

        System.out.printf("Average is: %.1f%n", average);*/


/*        Write a program which will set up an array to hold 10 numbers and print
        out only the uneven numbers.Expected output: Array: 1 2 4 7 9 12
        Odd Array: 1 7 9*/

/*        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.print("Odd array: ");
        for (int number : numbers){
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }*/


/*        Write a program which will remove the duplicate elements of a given
        array [20, 20, 40, 20, 30, 40, 50, 60, 50].
        Expected output: Array: 20 20 40 20 30 40 50 60 50
        Array without duplicate values: 20 40 30 50 60*/

/*        int[] numbers = {20, 20, 40, 20, 30, 40, 50, 60, 50};

        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        *//* We set the length of noDuplicants to numbers.length, since all
        numbers might be unique. *//*
        int[] noDuplicates = new int[numbers.length];
        int uniqueCount = 0;

        // Loop through all numbers.
        for (int number : numbers) {
            boolean found = false;

            // Check if the number exists in noDuplicates.
            for (int i = 0; i < uniqueCount; i++) {
                if (noDuplicates[i]  == number) {
                    found = true;
                    break; // Already exists, stop looking.
                }
            }

            // If the number not exist, add it to noDuplicates.
            if (!found) {
                noDuplicates[uniqueCount] = number;
                uniqueCount++;
            }
        }

        System.out.print("Array without duplicate values: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(noDuplicates[i] + " ");
        }
        System.out.println();*/


/*        Write a method which will add elements in an array.
        Remember that arrays are fixed in size so you need to come up with a
        solution to “expand” the array.*/

/*        int[] originalArray = {1, 2, 3, 4, 5};
        int[] newArray = addToArray(originalArray, 6);
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Array with added value: " + Arrays.toString(newArray));

    }

    public static int[] addToArray(int[] originalArray, int valueToAdd) {

        int[] newArray = Arrays.copyOf(originalArray, originalArray.length + 1);

        newArray[newArray.length -1] = valueToAdd;

        return newArray;
    }*/


/*        Write a program which will represent multiplication table stored in
        multidimensional array.
        Hint: You have two-dimensional array with values
                [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]*/

/*        // Setting up the grid.
        int[][] gridArray = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        };

        // Setting up the new [][] array where we store the multiplied values.
        int[][] result = new int[10][10];

        // Loop that multiplies the grid numbers with each other.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                result[i][j] = gridArray[0][i] * gridArray[1][j];
            }
        }

        // Prints the result.
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }*/


/*        Write a program that ask the user for an integer and repeat that
        question until user give you a specific value that user already has been
        told about as a message in your program. Store these values in an array
        and print that array. After that reverse the array elements so that the
        first element becomes the last element, the second element becomes
        the second to last element, etc. Do not just reverse the order in which
        they are printed. You need to change the way they are stored in the
        array.*/

/*        // Solution with lists.
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        final int TERMINATION_VALUE = 13;

        System.out.println("Please enter a whole number (eg. 1, 5, 7). Enter " + TERMINATION_VALUE + " to exit.");

        while (true) {
            System.out.print("Value: ");

            // Checks if the user input is a valid value.
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();

                // Breaks loop by entering the TERMINATION_VALUE.
                if (input == TERMINATION_VALUE) {
                    break;
                }

                // Adds the user input to the list.
                numbers.add(input);
            }

            // Catches all types of invalid user inputs.
            else {
                System.out.println("Invalid input. Please enter a valid whole number, or enter " + TERMINATION_VALUE + " to exit.");
                scanner.next();
            }

        }

        // Prints out the list.
        System.out.println("Values entered: " + numbers);

        // Reverses the list by swapping the index values around.
        Collections.reverse(numbers);

        // Prints the reversed list.
        System.out.println("Reversed values: " + numbers);*/

    }
}