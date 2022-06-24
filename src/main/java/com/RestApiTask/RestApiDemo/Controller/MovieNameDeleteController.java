package com.RestApiTask.RestApiDemo.Controller;

import com.RestApiTask.RestApiDemo.Form.UpdateForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MovieNameDeleteController {

    @DeleteMapping("/movie-info/{id}")
    public ResponseEntity<Map<String,String>> deleteMovieInfo(@PathVariable("id")int id) {
        return ResponseEntity.ok(Map.of("Message","MovieInfo successfully deleted"));
    }
}
