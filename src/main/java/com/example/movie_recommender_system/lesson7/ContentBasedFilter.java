package com.example.movie_recommender_system.lesson7;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {

    public ContentBasedFilter() {
        super();
    }
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"M1", "M2", "M3"};
    }
}
