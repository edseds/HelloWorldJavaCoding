package com;

import java.util.ArrayList;

public class District {

    private String title;
    private String city;
    private int districtId;
    private ArrayList<Officer> officersInTheDistrict;

    public District() {
    }

    public District(String title, String city, int districtId, ArrayList<Officer> officers)
    {
        this.title = title;
        this.city = city;
        this.districtId = districtId;
        officersInTheDistrict = new ArrayList<>(officers);
    }


    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public ArrayList<Officer> getOfficersInTheDistrict() {
        return officersInTheDistrict;
    }

    public void setOfficersInTheDistrict(ArrayList<Officer> officersInTheDistrict) {
        this.officersInTheDistrict = officersInTheDistrict;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
