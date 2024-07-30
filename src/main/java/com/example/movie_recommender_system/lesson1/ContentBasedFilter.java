package com.example.movie_recommender_system.lesson1;

import com.example.movie_recommender_system.lesson2.Filter;

public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"M1", "M2", "M3"};
    }
}
