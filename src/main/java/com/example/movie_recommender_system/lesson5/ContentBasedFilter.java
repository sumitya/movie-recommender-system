package com.example.movie_recommender_system.lesson5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cbf")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"M1", "M2", "M3"};
    }
}
