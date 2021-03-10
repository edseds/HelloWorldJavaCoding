package com;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        ArrayList<District> districts = new ArrayList<>();

        ArrayList<Officer> officers = new ArrayList<>(asList(
                new Officer("Sam", "Spade", 22890, 75),
                new Officer("Sam2", "Spade2", 22891, 75)
                ));

        districts.add(new District("District9", "Riga", 8, officers));

        officers = new ArrayList<>(asList(
                new Officer("Clarice", "Starling", 22894, 75),
                new Officer("Clarice2", "Starling", 22895, 75),
                new Officer("Clarice3", "Starling", 22136, 5)
        ));

        districts.add(new District("District10", "Sigulda",9,officers));


        for(District district : districts)
        {
            System.out.println("District Name: " + district.getTitle());
            System.out.println("Count of officer: " + district.getOfficersInTheDistrict().size());

            for (Officer officer : district.getOfficersInTheDistrict())
            {
                System.out.format("Officer name %s and surname %s%n",officer.getName(),officer.getSurname());
            }
        }



    }
}



















        /* Officer officer2 = new Officer("Sam", "Spade", 22890, "District1", 75);
        Officer officer3 = new Officer("Will", "Graham", 21711, "District9", 35);
        Officer officer4 = new Officer("Clarice", "Starling", 28122, "District5", 88);
        Officer officer5 = new Officer("Jim", "Hopper", 22130, "Center", 5);
        Officer officer6 = new Officer();

        officer6.setName("Harry");
        officer6.setSurname("Callahan");
        officer6.setOfficerID(21917);
        officer6.setWorkingDistrict("Center");
        officer6.setCrimesSolved(16);

        System.out.println(officer1.toString());
        System.out.println(officer2.toString());
        System.out.println(officer3.toString());
        System.out.println(officer4.toString());
        System.out.println(officer5.toString());
        System.out.println(officer6.toString());

        ArrayList<Officer> district99 = new ArrayList<>();
        district99.add(officer1);
        district99.add(officer2);
        district99.add(officer3);
        district99.add(officer4);
        district99.add(officer5);
        district99.add(officer6);

        int countOfFirstLevel = 0;
        int countOfMoreThanFirstLevel = 0;
        int countOfJohn = 0;

        for(Officer officer : district99) {
            if(officer.calculatedLevel() == 1) {
                countOfFirstLevel++;
            }

            if(officer.calculatedLevel() > 1) {
                countOfMoreThanFirstLevel++;
            }

            if(officer.getName().equals("John")) {
                countOfJohn++;
            }
        }

        System.out.println("John: "+ countOfJohn);
        System.out.println("Count of First Level: " + countOfFirstLevel);
        System.out.println("Count of More Than First level: " + countOfMoreThanFirstLevel);

        Scanner input = new Scanner(System.in);
        char choice;
        Officer officer;

        do
        {

            officer = new Officer();

            System.out.println("Enter name");
            officer.setName(input.nextLine());
            System.out.println("Enter surname");
            officer.setSurname(input.nextLine());
            System.out.println("Enter OfficerID");
            officer.setOfficerID(input.nextInt());
            input.nextLine();
            System.out.println("Enter working district");
            officer.setWorkingDistrict(input.nextLine());
            System.out.println("How many crimes solved?");
            officer.setCrimesSolved(input.nextInt());
            input.nextLine();


            district99.add(officer);

            System.out.print("Enter Y for yes or N for no: ");
            choice = input.next().charAt(0);
            input.nextLine();

        }
        while ((choice == 'y') || (choice == 'Y'));


        for (Officer off : district99)
        {
            System.out.println(off.toString());
        }

    }*/
//}