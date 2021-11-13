package com.example.springPractice.service;

import com.example.springPractice.domain.Movie;
import com.example.springPractice.domain.MovieList;

public interface MovieService {
    MovieList find(String movieName, String directorName);

    Movie get(String movieId);

    void add(Movie movie);

    void set(Movie movie);

    void remove(String  movieId);
}
