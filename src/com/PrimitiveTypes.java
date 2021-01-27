package com;

public class PrimitiveTypes {

    public static void intValues() {
        int val = 10000;

        //Wrapper class
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        int someValue;

        var number = 6;

        //sout shortcut
        System.out.println("Minimum value: " + minValue);
        //Underflow or Overflow. Put larger than the maximum value, you will get overflow. And vice versa.
        //????
        System.out.println("Max value: " + maxValue);
        System.out.println("Max value: " + (maxValue + 20));
        ///System.out.println();


        //System.out.println("Max value: " + maxValue);

        int myValueUnderScore = 1_14_15;
        System.out.println(myValueUnderScore);

        long longValue = 9_32_3231_31_323L;
    }

    public static void castingValues()
    {
        int intValue = 120;
        byte byteValue = (byte) intValue;
        System.out.println(byteValue);

    }

    public static void charBoolean()
    {
        char myChar = 'D';
        //https://unicode-table.com/en/#basic-latin
        char value = '\u0148';
        boolean isTrue = false;


        System.out.println(value);




    }

    public static void floatDouble()
    {
        float minValue = Float.MIN_VALUE;
        float maxValue = Float.MAX_VALUE;

        System.out.println("Minimum value: " + minValue);
        System.out.println("Max value: " + maxValue);

        //What should we do to remove No error???
        float PI = 3.14f;
        double PI_2 = 3.14;

        //Challenge convert grams to kg. In your code.!!!!
    }


    public static void byteValue() {
        byte minValue = Byte.MIN_VALUE;
        byte maxValue = Byte.MAX_VALUE;
        System.out.println("Minimum value: " + minValue);
        System.out.println("Max value: " + maxValue);
    }

    public static void shortValues() {
        short minValue = Short.MIN_VALUE;
        short maxValue = Short.MAX_VALUE;
        System.out.println("Minimum value: " + minValue);
        System.out.println("Max value: " + maxValue);
    }

    public static void longValues() {
        long minValue = Long.MIN_VALUE;
        long maxValue = Long.MAX_VALUE;
        System.out.println("Minimum value: " + minValue);
        System.out.println("Max value: " + maxValue);

        long val = 1000L;

        System.out.println("Value: " + val);
    }
}
