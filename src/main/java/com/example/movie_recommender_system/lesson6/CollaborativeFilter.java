package com.example.movie_recommender_system.lesson6;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
