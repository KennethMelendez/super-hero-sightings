package com.herosightings.models;

import lombok.Data;
import java.util.Map;

@Data
public class Response {

    private Map<Long ,SuperHero> superHeroList;

    Boolean isSuccessful;

    String errorMessage;

}
