package com.RestApiTask.RestApiDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MovieNameGetController {

    @GetMapping("/movie-info")
    public Map<String,String> getMovieInfo(@RequestParam(name = "movie-list",required = true)String getInfo){
        return Map.of("2019","Dark Waters" ,"2012","Frances Ha");
    }
}
