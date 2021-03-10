package com;


public class Officer {

    private String name;
    String surname;
    public int officerID;
    private String workingDistrict;
    private int crimesSolved;

    public Officer(String name, String surname, int officerID, int crimesSolved) {
        this.name = name;
        this.surname = surname;
        this.officerID = officerID;
        this.crimesSolved = crimesSolved;
    }

    public Officer() {
    }

    public int calculatedLevel() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public String getWorkingDistrict() {
        return workingDistrict;
    }

    public void setWorkingDistrict(String workingDistrict) {
        this.workingDistrict = workingDistrict;
    }

    public int getCrimesSolved() {
        return crimesSolved;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }

    public String toString() {
        return name + ", " + surname + ", " + officerID + ", " + workingDistrict + ", " + crimesSolved + ".";
    }

}