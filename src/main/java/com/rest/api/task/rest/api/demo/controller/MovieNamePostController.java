package com.rest.api.task.rest.api.demo.controller;

import com.rest.api.task.rest.api.demo.form.CreateForm;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

@RestController
public class MovieNamePostController {

    @PostMapping("/movies")
    public ResponseEntity<Map<String, String>> createMovieInfo(@RequestBody @Validated CreateForm form) {
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/movies/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("Message", "MovieInfo successfully created"));
    }
}
