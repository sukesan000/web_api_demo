package com.example.springPractice.repository;

import com.example.springPractice.domain.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> findList(String movieName, String directorName);

    Movie findOne(String movieId);

    Movie lock(String movieId);

    void insert(Movie movie);

    void update(Movie movie);

    void delete(Movie movie);
}
