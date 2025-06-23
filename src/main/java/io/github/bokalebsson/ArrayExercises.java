package io.github.bokalebsson;

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

    }

    public static int indexOf(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }*/



    }
}