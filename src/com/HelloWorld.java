package com;


import java.util.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class HelloWorld {

    public static void main(String[] args) {




        ArrayList<Employee> arrayList = new ArrayList<>();


        //Employee employee = new Employee("Anna",43);
       // employee.name = "";
        Employee.surname="3333";

        Employee employee1 = new Employee();
        employee1.getDesignation();

        Employee.staticMethod();

        //Employee employee2 = new Employee("");



        //employee.name = "1111";
        //Employee




        //employee.setAge(10);
        //employee.setName("Anna");

       // arrayList.add(employee);

      //  for(Employee emp : arrayList)
      //  {
     //       System.out.println(emp.getAge());
     //       System.out.println(emp.getName());
     //   }



        //employee.age = 23;

        //DataStructures.arrayListExample();
        //DataStructures.linkedListExample();
        //DataStructures.stackExample();
        //DataStructures.queueExample();
        //DataStructures.dequeExample();
        //DataStructures.treeSetExample();
        //DataStructures.hashMapExample();
        //DataStructures.hashMapSort();
        //DataStructures.hashTableExample();
    }

    public static String convertToLettersOnly(String str) {

        //str = str.toLowerCase(); // how to apply Pattern.CASE_INSENSITIVE here?
        String strLettersOnly = str.replaceAll("[^a-zA-Z]", "");

        return strLettersOnly;
    }


    private static int wordCounter(String sentence)
    {
        String trim = sentence.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length;
    }

    public static final void printHistogram(String[] stringArr) {
        int max = stringArr[0].length();
        for (String value : stringArr)
            max = value.length() > max ? value.length() : max;
        boolean[][] array = new boolean[max][stringArr.length];
        for (int i = stringArr.length - 1; i >= 0; i--) {
            for (int j = 0; j < stringArr[i].length(); j++) {
                array[j][i] = true;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            boolean[] booleans = array[i];
            for (boolean b : booleans) {
                System.out.print(b ? '*' : ' ');
            }
            System.out.println();
        }

        for (int i = 1; i <= array.length; i++) {
            System.out.print(i);
        }
    }
}




//Strings.useOfStrings();
//Strings.useOfGreedy();
//Strings.useOfReluctant();
//Strings.useOfPossessive();

//DataStructures.stackExample();
//DataStructures.queueExample();



