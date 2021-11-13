package com.example.springPractice.repository.mybatis;

import com.example.springPractice.domain.Movie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MovieMapper {
    List<Movie> find(@Param("movieName") String movieName, @Param("directorName") String directorName);

    Movie get(@Param("movieId") String movieId);

    Movie lock(@Param("movieId") String movieId);

    int add(Movie movie);

    int set(Movie movie);

    int remove(Movie movie);
}
