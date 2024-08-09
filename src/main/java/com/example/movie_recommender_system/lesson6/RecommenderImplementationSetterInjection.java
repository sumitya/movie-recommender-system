package com.example.movie_recommender_system.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementationSetterInjection {

    //Filter is a dependency of RecommenderImplementation
    private Filter filter;
    //setter injection
    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter){
        this.filter = filter;

    }

    public String [] recommendMovies (String movie) {
        System.out.println("Filter used: " + filter + "\n");
        return filter.getRecommendations(movie);
    }
}
