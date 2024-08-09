package com.example.movie_recommender_system.lesson6;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        //RecommenderImplementation injects dependency using constructor
        System.out.println("\n*************************************************");
        System.out.println("Calling getBean() on RecommenderImplementationConstructorInjection");
        RecommenderImplementationConstructorInjection recommender = appContext.getBean(RecommenderImplementationConstructorInjection.class);
        String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
        //RecommenderImplementation2 injects dependency using setter method
        System.out.println("\n*************************************************");
        System.out.println("Calling getBean() on RecommenderImplementationSetterInjection");
        RecommenderImplementationSetterInjection recommender2 = appContext.getBean(RecommenderImplementationSetterInjection.class);
        result = recommender2.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
    }
}