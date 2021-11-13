package com.example.springPractice.service;

import com.example.springPractice.domain.Movie;
import com.example.springPractice.domain.MovieList;
import com.example.springPractice.repository.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieServiceImpl implements  MovieService{
    private final MovieRepository repository;

    public MovieServiceImpl(MovieRepository repository){
        this.repository = repository;
    }

    @Override
    public MovieList find(String movieName, String directorName) {
        MovieList movieList = new MovieList();
        movieList.setMovieList(this.repository.findList(movieName, directorName));
        return movieList;
    }

    @Override
    public Movie get(String movieId) {
        Movie movie = this.repository.findOne(movieId);
        return movie;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void add(Movie movie) {
        this.repository.insert(movie);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void set(Movie movie) {
        this.repository.lock(movie.getMovieId());
        this.repository.update(movie);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void remove(String movieId) {
        this.repository.delete(this.repository.findOne(movieId));
    }
}
