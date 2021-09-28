package com.herosightings.models.repositories;

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
}
