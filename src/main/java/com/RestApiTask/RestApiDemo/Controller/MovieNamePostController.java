package com.RestApiTask.RestApiDemo.Controller;

import com.RestApiTask.RestApiDemo.Form.CreateForm;
import org.apache.catalina.startup.CertificateCreateRule;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

@RestController
public class MovieNamePostController {

    @PostMapping("/movie-info")
    public ResponseEntity<Map<String,String>> createMovieInfo(@RequestBody @Validated CreateForm form){
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/movie-info/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("Message","MovieInfo successfully created"));
    }
}
