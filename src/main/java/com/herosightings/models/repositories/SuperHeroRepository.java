package com.herosightings.models.repositories;

import com.herosightings.models.Location;
import com.herosightings.models.Response;
import com.herosightings.models.SuperHero;

public interface SuperHeroRepository {

    Response getById(Long id);

    Response addSuperHero(SuperHero currentSuperHero);

    Response removeSuperHeroById(Long id);

    Response updateSuperHeroById(Long id);

    Response getAllSuperHeros();

    Response getSuperHerosByLocations(Location location);

}
