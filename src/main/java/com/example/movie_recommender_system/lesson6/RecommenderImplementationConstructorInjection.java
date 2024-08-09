package com.example.movie_recommender_system.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementationConstructorInjection {
    //Filter is a dependency of RecommenderImplementation
    private Filter filter;
    // constructor injection
    @Autowired
    public RecommenderImplementationConstructorInjection(@Qualifier("collaborativeFilter") Filter filter) {
        super();
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }
    public String [] recommendMovies (String movie) {
        System.out.println("Filter used: " + filter + "\n");
        return filter.getRecommendations(movie);
    }
}
