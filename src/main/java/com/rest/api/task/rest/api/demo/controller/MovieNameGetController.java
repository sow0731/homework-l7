package com.rest.api.task.rest.api.demo.controller;

import com.rest.api.task.rest.api.demo.MovieInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieNameGetController {

    @GetMapping("/movies")
    public List<MovieInfo> getMovieInfo(@RequestParam(name = "movie-list", required = true) String movies) {
        return List.of(
                new MovieInfo("Dark Waters", "2019"),
                new MovieInfo("Frances Ha", "2012"));
    }
}
