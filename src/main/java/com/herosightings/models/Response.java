package com.herosightings.models;

import lombok.Data;
import org.springframework.lang.Nullable;

import java.util.Map;

@Data
public class Response {

    private Map<Long ,SuperHero> superHeroList;

    Boolean isSuccessful;

    @Nullable
    String errorMessage;

}
