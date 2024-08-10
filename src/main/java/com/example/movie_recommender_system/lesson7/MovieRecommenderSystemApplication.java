package com.example.movie_recommender_system.lesson7;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        ContentBasedFilter filter1 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter filter2 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter filter3 = appContext.getBean(ContentBasedFilter.class);

        System.out.println(filter1 + "\n"+filter2+"\n"+filter3+"\n");

        CollaborativeFilter filter4 = appContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter filter5 = appContext.getBean(CollaborativeFilter.class);

        System.out.println(filter4 + "\n"+filter5);
    }
}