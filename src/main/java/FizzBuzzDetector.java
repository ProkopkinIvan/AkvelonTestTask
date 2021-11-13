//Prokopkin Ivan by 13.11.2021
package main.java;

import java.util.*;

public class FizzBuzzDetector
{
    public static void main(String[]args) {
        System.out.println("Enter your text from 7 to 100 words:");
        getOverlappings();
        }

    public static void getOverlappings () {
        String s = new Scanner(System.in).useDelimiter("\\z").next();
        //next line writes text to array of strings
        String[] words = s.split("\\s+");
        int count= 0;
        //the next line checks the text input condition
        if (words.length >= 7 && words.length <= 100) {
            //the next cycle gets rid of spaces and punctuation marks
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].replaceAll("[^\\w]", "");
            }
            //the following lines implement fizzbuzz detection algorithm and replaces them
            for (int j = 0; j < words.length; j++) {
                if (((j + 1) % 3 == 0) && ((j + 1) % 5 == 0)) {
                    count++;
                    System.out.print("FizzBuzz" + " ");
                } else if (((j + 1) % 3 == 0)) {
                    count++;
                    System.out.print("Fizz" + " ");
                } else if (((j + 1) % 5 == 0)) {
                    count++;
                    System.out.print("Buzz" + " ");
                } else {
                    System.out.print(words[j] + " ");
                }
            }
        }
        else {
            throw new Error();
        }

        System.out.println("count is" + " " + count);

    }
}

