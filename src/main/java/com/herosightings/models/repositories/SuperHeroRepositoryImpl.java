package com.herosightings.models.repositories;

import com.herosightings.models.Location;
import com.herosightings.models.Response;
import com.herosightings.models.SuperHero;

import java.util.HashMap;
import java.util.Map;

public class SuperHeroRepositoryImpl implements SuperHeroRepository{

    private Map<Long, SuperHero> superHeroCollection = new HashMap<Long, SuperHero>();

    @Override
    public Response getById(Long id) {
        Response response = new Response();
        Map<Long, SuperHero> responseList = new HashMap<>();

        SuperHero currentHero;

        try {

            currentHero = superHeroCollection.get(id);
            responseList.put(id, currentHero);
            response.setSuperHeroList(responseList);

        } catch (Exception exception) {

            response.setErrorMessage(exception.getMessage());
            response.setIsSuccessful(false);

        }

        return response;
    }

    @Override
    public Response addSuperHero(SuperHero currentSuperHero) {

        Response response = new Response();

        superHeroCollection.put(currentSuperHero.getId(), currentSuperHero);

        response.setSuperHeroList(superHeroCollection);
        response.setIsSuccessful(true);
        response.setErrorMessage(null);

        return null;
    }

    @Override
    public Response removeSuperHeroById(Long id) {

        Response response = new Response();

        try {

            superHeroCollection.remove(id);
            response.setSuperHeroList(superHeroCollection);
            response.setIsSuccessful(true);

        } catch (Exception exception) {

            response.setErrorMessage(exception.getMessage());
            response.setIsSuccessful(false);

        }

        return response;
    }

    @Override
    public Response updateSuperHeroById(Long id) {
        return null;
    }

    @Override
    public Response getAllSuperHeros() {

        Response response = new Response();

            response.setSuperHeroList(superHeroCollection);
            response.setErrorMessage(null);
            response.setIsSuccessful(true);

        return response;
    }

    @Override
    public Response getSuperHerosByLocations(Location location) {
        return null;
    }
}
