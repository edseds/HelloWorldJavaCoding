package com;

public class Loops {

    static int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void forLoop() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Num:" + numbers[i]);
        }

        System.out.println("==================================================");

        for (int i = 0; i < numbers.length; i +=3) {
            System.out.println("Num:" + numbers[i]);
        }
    }

    public static void forEachLoop() {
        for (int num : numbers) {
            System.out.println("Num:" + num);
        }
    }
}
