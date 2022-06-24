package com.RestApiTask.RestApiDemo.Controller;

import com.RestApiTask.RestApiDemo.Form.UpdateForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MovieNamePatchController {

    @PatchMapping("/movie-info/{id}")
    public ResponseEntity<Map<String,String>> updateMovieInfo(@PathVariable("id")int id, @RequestBody UpdateForm form) {
        return ResponseEntity.ok(Map.of("Message","MovieInfo successfully updated"));
    }

}
