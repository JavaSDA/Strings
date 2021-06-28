package com.company;

public class Main {

    public static void main(String[] args) {
	    // Strings are a data type in java. Complex Objects.
        // Immutability means it can't be changed
        // A string literal is a string not assigned to a variable

        String a = "APPLE";
        // concatenation is simply joining two strings together to form a new string.
        String me = "I love ";
        String sentence = me.trim() + a;

        // Byte, Short, Integer, Long, Float, Double => wrapper classes
//        byte, short, int, long, float, double;
        double eight = 3.14028273;
//        float number = (float)eight;
//        System.out.println(number);


        // java.lang
        String five = "5";
        double five5 = Double.parseDouble(five);

        System.out.println(Integer.max((int)five5, 7));

//        System.out.println(sentence);

        // 1. Write a program that takes a string
        // and prints the number of vowels in that string.
        // e.g Apples - "There are two vowels in the string, Apples"

        // 2. Write a program that adds the value two strings
        // using the wrapper classes to parse the strings.
        // e.g "5" + "8" = 13


    }
}
