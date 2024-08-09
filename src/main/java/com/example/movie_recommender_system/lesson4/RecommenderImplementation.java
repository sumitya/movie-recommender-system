package com.example.movie_recommender_system.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    //Filter is a dependency of RecommenderImplementation
    @Autowired
    private Filter contentBasedFilter;

    public String [] recommendMovies (String movie) {
        System.out.println("Filter used: " + contentBasedFilter + "\n");
        return contentBasedFilter.getRecommendations(movie);
    }
}
