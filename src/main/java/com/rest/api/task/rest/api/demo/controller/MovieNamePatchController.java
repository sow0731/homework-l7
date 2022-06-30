package com.rest.api.task.rest.api.demo.controller;

import com.rest.api.task.rest.api.demo.form.UpdateForm;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MovieNamePatchController {

    @PatchMapping("/movies/{id}")
    public ResponseEntity<Map<String, String>> updateMovieInfo(@PathVariable("id") int id, @Validated @RequestBody UpdateForm form) {
        return ResponseEntity.ok(Map.of("Message", "MovieInfo successfully updated"));
    }

}
