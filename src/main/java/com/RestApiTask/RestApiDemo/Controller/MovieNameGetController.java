package com.RestApiTask.RestApiDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieNameGetController {

    @GetMapping("/movie-info")
    public List<String> getMovieInfo(){
        return List.of("Dark Waters","Frances Ha");
    }
}
