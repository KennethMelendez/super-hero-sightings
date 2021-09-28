package com.herosightings.models.repositories;

import com.herosightings.models.Response;
import com.herosightings.models.SuperHero;

public interface SuperHeroRepository {

    Response getById(Long id);

}
