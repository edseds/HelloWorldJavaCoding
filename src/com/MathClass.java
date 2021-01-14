package com;
import static java.lang.Math.*;

public class MathClass {

    public static void priorities() {
        int value = (10 + 5) * 4;
        System.out.println(value);
        value = 10 + 5 * 4;
        System.out.println(value);
    }

    public static void relationOperators() {
        boolean isPerson = true;

        if (isPerson) {
            System.out.println("You are a person");
        }
    }

    public static void otherOperators() {
        boolean isCat = true;

        boolean checkCat = isCat ? true : false;
    }

    public static void mathClass() {
        double num = 4.5;
        System.out.println(round(num));

        //Round down??? Challenge

        System.out.println(Math.sqrt(25));

       // System.out.println(getRandomNumber(10,20));

    }


}
