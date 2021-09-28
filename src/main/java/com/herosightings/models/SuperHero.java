package com.herosightings.models;

import com.herosightings.enums.SuperPowerTypes;
import lombok.Data;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.List;

@Data
public class SuperHero {

    @NonNull
    private Long id;

    private String superHeroName;

    @Nullable
    private String realName;

    private Location superHeroFoundlocation;

    private List<SuperPowers> superPowers;

}
