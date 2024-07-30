package com.example.movie_recommender_system.lesson2;

import com.example.movie_recommender_system.lesson1.ContentBasedFilter;

public class RecommenderImplementation {

    private Filter filter;
    public RecommenderImplementation(Filter filter){
        this.filter = filter;
    }
    public String [] recommendMovies (String movie) {
        System.out.println("Filter used: " + filter + "\n");
        return filter.getRecommendations(movie);
    }
}
