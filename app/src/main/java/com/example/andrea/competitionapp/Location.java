package com.example.andrea.competitionapp;

import java.util.ArrayList;

/**
 * Created by havak on 3/28/18.
 */

public class Location {
    private String zipCode;
    private String street;
    private String state;
    private String city;

    public Location(String zipCode, String street, String state, String city) {
        this.zipCode = zipCode;
        this.street = street;
        this.state = state;
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}


//        public Location(String address){
//            delimiter = " ";
//            ArrayList <String> numInfo = new ArrayList <String> ();
//            ArrayList <String> nameInfo = new ArrayList <String> ();
//            ArrayList <String> cityInfo = new ArrayList <String> ();
//            ArrayList <String> stateInfo = new ArrayList <String> ();
//            ArrayList <String> zipInfo = new ArrayList <String> ();
//            this.address = address;
//            tracker = 0;
//        }
//
//        private ArrayList getStreetNum(){
//            for (int i = 0; i < address.length(); i++){
//                if (address.matches(delimiter)){
//                    for (int j = 0; j < i; j++) {
//                        numInfo.add(address.charAt(j), address);
//                    }
//                    break;
//                }
//            }
//
//            return numInfo;
//        }
//
//        private ArrayList getStreetName() {
//            for (int i = 0; i < address.length(); i++) {
//                if (address.matches(delimiter) && tracker == 1) {
//                    int start = i;
//                }
//
//                if ((address.charAt(i).isEqualTo("S") && (address.charAt(i + 1).isEqualTo("t")) && (address.charAt(i + 2).isEqualTo(","))) ||
//                        ((address.charAt(i).isEqualTo("S")) && (address.charAt(i + 1).isEqualTo("t")) && (address.charAt(i + 2) == ".")) ||
//                        ((address.charAt(i).isEqualTo("S") && (address.charAt(i + 1).isEqualTo("t")) && (address.charAt(i + 2) == "r") && (address.charAt(i + 3) == "e") && (address.charAt(i + 4) == "e") && (address.charAt(i + 5) == "t")) ||
//                        ((address.charAt(i).isEqualTo("R")) && (address.charAt(i + 2).isEqualTo("d")) && (address.charAt(i + 3) == ",")) ||
//                        ((address.charAt(i).isEqualTo("R")) && (address.charAt(i + 2).isEqualTo("d")) && (address.charAt(i + 3) == ".")) ||
//                        ((address.charAt(i).isEqualTo("R")) && (address.charAt(i + 2).isEqualTo("o")) && (address.charAt(i + 3) == "a") && (address.charAt(i + 4) == "d")) ||
//                        ((address.charAt(i).isEqualTo("D")) && (address.charAt(i + 2).isEqualTo("r")) && (address.charAt(i + 3) == ",")) ||
//                        ((address.charAt(i).isEqualTo("D")) && (address.charAt(i + 2).isEqualTo("r")) && (address.charAt(i + 3) == ".")) ||
//                        ((address.charAt(i).isEqualTo("D")) && (address.charAt(i + 2) == "r") && (address.charAt(i + 3) == "i") && (address.charAt(i + 4) == "v") && (address.charAt(i + 5) == "e"))) {
//
//                }
//            }
//
//        }
//
//
//    }




