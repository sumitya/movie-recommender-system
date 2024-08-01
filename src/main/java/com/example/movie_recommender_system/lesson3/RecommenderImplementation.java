package com.example.movie_recommender_system.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    //Filter is a dependency of RecommenderImplementation
    @Autowired
    private Filter filter;

    public RecommenderImplementation(Filter filter){
        this.filter = filter;
    }
    public String [] recommendMovies (String movie) {
        System.out.println("Filter used: " + filter + "\n");
        return filter.getRecommendations(movie);
    }
}
