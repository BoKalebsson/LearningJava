package io.github.bokalebsson;

import java.util.Arrays;

public class StringExercises {

    public static void main(String[] args) {

/*        What is the length of the String: "Java" ? */

/*        String text = "Java";
        System.out.println("Length of string: " + text.length());*/

/*        What char is at index position 6 in the following String:
        "Long example sentence" ?*/

/*        String text = "Long example sentence";
        System.out.println("The letter at position 6 is: " +text.charAt(6));*/


/*        What is the index position of 'o' in the following String:
        "Even longer example sentence" ?*/

/*        String text = "Even longer example sentence";
        System.out.println("The index position of 'o' is: " + text.indexOf("o"));*/


/*        Given the following String: "Ok this is not as long!"
        create a substring of only "not as long" (excluding the
        exclamation point) and print it out.*/

/*        String text = "Ok this is not as long!";
        int start = text.indexOf("not");
        System.out.println("Index of 'not': " + start);
        int end = text.indexOf("!");
        System.out.println("Index of '!': " + end);
        String result = text.substring(start, end);
        System.out.println("The substring: " + result);*/


/*        Convert the following String: "CAPS EQUALS SCREAMING" to
        lowercase and print it out. Then convert it back to
        uppercase and print it out again.*/

/*        String text = "CAPS EQUALS SCREAMING";
        System.out.println("LowerCase: " + text.toLowerCase());
        System.out.println("UpperCase: " + text.toUpperCase());*/


/*        Correct the following String: "Java is the worst
        programming language!" by replacing the (obviously
        incorrect) word "worst" with the word "best". Then print
        out the sentence.*/

/*        String text = "Java is the worst programming language!";
        System.out.println(text.replace("worst", "best"));*/


/*        What is the output of the following String:
        "\tJ\ta\tv\ta\t" after you trim it?*/

/*        String text = "\tJ\ta\tv\ta\t";
        System.out.println("Text: " + text);
        System.out.println("Text after trim: " + text.trim());*/


/*        Parse the following int: 20 to a String and add a 20 to the
        end of the String. Printing it out should return: "2020".*/

/*        int number = 20;
        String text = Integer.toString(number);
        System.out.println(text + "20");*/


/*        Oil and water don't go well together. Given the String:
        "Oil and Water", split them up into the words "Oil","Water"
        and store them in a String array.*/

/*        String text = "Oil and Water";
        String[] words = text.split(" and ");
        System.out.println(Arrays.toString(words));*/


/*        Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
        into an array. Print out all names separately.*/

/*        String names = "Carl,Susie,Fredrick,Bob,Erik";
        String[] namesArray = names.split(",");

        System.out.println("For-each-loop: ");
        for (String name : namesArray) {
            System.out.println(name);
        }
        System.out.println("For-loop: ");
        for (int i = 0; i < namesArray.length; i++) {
            System.out.println(namesArray[i]);
        }*/


/*        Convert the following String: "ThisShouldBeConverted" to
        a char array. Iterate through the char array and print out
        each element.*/

/*        String text = "ThisShouldBeConverted";
        char[] letterArray = text.toCharArray();

        System.out.println("For-each-loop: ");
        for (char letter : letterArray) {
            System.out.print(letter + " ");
        }

        System.out.println();

        System.out.println("For-loop: ");
        for (int i = 0; i < letterArray.length; i++) {
            System.out.print(letterArray[i] + " ");
        }*/


/*        Convert the following char[]: {'J','a','v','a'} to a
        String and print it out.*/

/*        char[] letters = {'J','a','v','a'};
        System.out.println("CharArray: " + Arrays.toString(letters));
        String convertedString = new String(letters);
        System.out.println("Converted String: " + convertedString);

        StringBuilder builder = new StringBuilder();
        for (char c : letters) {
            builder.append(c);
        }
        String result = builder.toString();
        System.out.println("String Builder: " + result);*/


    }

}
