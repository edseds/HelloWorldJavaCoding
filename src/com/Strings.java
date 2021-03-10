package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {

    public static void useOfStrings() {
        String text = "geeks1for2geeks3";

        // Specifies the string pattern which is to be searched
        String delimiter = "\\d";
        Pattern pattern = Pattern.compile(delimiter,
                Pattern.CASE_INSENSITIVE);

        // Used to perform case insensitive search of the string
        String[] result = pattern.split(text);


        for (String temp : result)
            System.out.println(temp);
    }

    //By default, quantifiers are Greedy. Greedy quantifiers try to match the
    // longest text that matches given pattern.
    // Greedy quantifiers work by first reading the entire string before trying any match
    public static void useOfGreedy() {
        Pattern p = Pattern.compile("g+");

        // Making an instance of Matcher class
        Matcher m = p.matcher("cdgggcdggg");

        while (m.find())
            System.out.println("Pattern found from " + m.start() +
                    " to " + (m.end() - 1));
    }

    // This quantifier uses the approach that is opposite of greedy quantifiers.
    // It starts from first character and processes one character at a time.
    public static void useOfReluctant() {
        // Making an instance of Pattern class
        // Here "+" is a Reluctant quantifier because
        // a "?' is appended after it.
        Pattern p = Pattern.compile("g+?");

        // Making an instance of Matcher class
        Matcher m = p.matcher("ggg");

        while (m.find())
            System.out.println("Pattern found from " + m.start() +
                    " to " + (m.end() - 1));
    }

    //This quantifier matches as many characters as it can like greedy quantifier.
    // But if the entire string doesn’t match, then it doesn’t try removing characters from end
    public static void useOfPossessive() {
        // Making an instance of Pattern class
        // Here "+" is a Possessive quantifier because
        // a "+' is appended after it.
        Pattern p = Pattern.compile("ggg++");

        // Making an instance of Matcher class
        Matcher m = p.matcher("cdgggcdgggdd");

        while (m.find())
            System.out.println("Pattern found from " + m.start() +
                    " to " + (m.end() - 1));
    }
}
