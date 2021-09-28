package com.herosightings.models;

import lombok.Data;

@Data
public class Location {

    String country;

    String state;

    String city;

    String street;

    String zip;

    String locationInfo;

    String getAddress(){
        return String.format("%s %s %s %s %s",
                street, state, city, zip, country);
    }

}
