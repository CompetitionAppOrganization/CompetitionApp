package com.example.andrea.competitionapp;

/**
 * Created by havak on 3/28/18.
 */

public class Location {

    public class Location {

        private String delimiter;
        private String address;
        private ArrayList <String> numInfo;
        private int tracker;

        public Location(String address){
            delimiter = " ";
            ArrayList <String> numInfo = new ArrayList <String> ();
            ArrayList <String> nameInfo = new ArrayList <String> ();
            ArrayList <String> cityInfo = new ArrayList <String> ();
            ArrayList <String> stateInfo = new ArrayList <String> ();
            ArrayList <String> zipInfo = new ArrayList <String> ();
            this.address = address;
            tracker = 0;
        }

        private ArrayList getStreetNum(){
            for (int i = 0; i < address.length(); i++){
                if (address.matches(delimiter)){
                    for (int j = 0; j < i; j++) {
                        numInfo.add(address.charAt(j), address);
                    }
                    break;
                }
            }

            return numInfo;
        }

        private ArrayList getStreetName() {
            for (int i = 0; i < address.length(); i++) {
                if (address.matches(delimiter) && tracker == 1) {
                    int start = i;
                }

                if (address.charAt(i) == "S" && address.charAt(i+1) == "t" && address.charAt(i+2) == ","||
                        address.charAt(i) == "S" && address.charAt(i+1) == "t" && address.charAt(i+2) == "." ||
                        address.charAt(i) == "S" && address.charAt(i+1) == "t" && address.charAt(i+2) == "r" && address.charAt(i+3) == "e" && address.charAt(i+4) == "e" && address.charAt(i+5) == "t" ||
                        address.charAt(i) == "R" && address.charAt(i+2) == "d" && address.charAt(i+3) == "," ||
                        address.charAt(i) == "R" && address.charAt(i+2) == "d" && address.charAt(i+3) == "." ||
                        address.charAt(i) == "R" && address.charAt(i+2) == "o" && address.charAt(i+3) == "a" && address.charAt(i+4) == "d" ||
                        address.charAt(i) == "D" && address.charAt(i+2) == "r" && address.charAt(i+3) == "," ||
                        address.charAt(i) == "D" && address.charAt(i+2) == "r" && address.charAt(i+3) == "." ||
                        address.charAt(i) == "D" && address.charAt(i+2) == "r" && address.charAt(i+3) == "i" && address.charAt(i+4) == "v" && address.charAt(i+5) == "e") {

                }
            }
        }


    }



}
