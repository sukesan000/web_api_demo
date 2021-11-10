package com.example.springPractice.domain;

import lombok.Data;

@Data
public class Movie {
    private String movieId;
    private String movieName;
    private String director;

    public Movie(){
    }

    public Movie(String movieId, String movieName, String director){
        this.movieId=movieId;
        this.movieName=movieName;
        this.director=director;
    }
}
