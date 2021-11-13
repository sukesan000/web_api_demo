package com.example.springPractice.controller;

import com.example.springPractice.domain.Movie;
import com.example.springPractice.domain.MovieList;
import com.example.springPractice.service.MovieService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/movie")
public class MoviesRestController {
    private final MovieService service;

    public MoviesRestController(MovieService service){
        this.service = service;
    }

    @GetMapping(path = "", produces = "application/json")
    public MovieList find(@RequestParam(name = "movieName", required = false) String movieName,
                          @RequestParam(name = "directorName", required = false) String directorName){
        return this.service.find(movieName, directorName);
    }

    @GetMapping(path = "/{movieId}", produces = "application/json")
    public Movie get(@PathVariable String movieId){
        return this.service.get(movieId);
    }

    @PostMapping(path = "", produces = "application/json")
    public void add(@RequestBody Movie movie){
        this.service.add(movie);
    }

    @PatchMapping(path = "/{movieId}", produces = "application/json")
    public void update(@PathVariable String movieId, @RequestBody Movie movie){
        movie.setMovieId(movieId);
        this.service.set(movie);
    }

    @DeleteMapping(path = "/{movieId}", produces = "application/json")
    public void remove(@PathVariable String movieId){
        this.service.remove(movieId);
    }
}
