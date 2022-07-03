package com.rest.api.task.rest.api.demo.controller;

import com.rest.api.task.rest.api.demo.MovieInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.InputMismatchException;
import java.util.List;

@RestController
public class MovieNameGetController {

    @GetMapping("/movies")
    public Object getMovieInfo(@RequestParam(name = "movies", required = true) int movieId) {
        List<MovieInfo> movieInfoList = List.of(
                new MovieInfo(1, "Dark Waters", "2019"),
                new MovieInfo(2, "Frances Ha", "2012"));
        try {
            if (movieId < 0 || movieId > 2) {
                throw new InputMismatchException("0~2の数値を入力してください");

            } else if (movieId == 0) {
                return movieInfoList.stream();

            } else if (movieId == 1) {
                return movieInfoList.stream().filter(movieInfo -> movieInfo.getMovieId() == 1);

            } else if (movieId == 2) {
                return movieInfoList.stream().filter(movieInfo -> movieInfo.getMovieId() == 2);
            }
        } catch (InputMismatchException e) {
            return "入力に誤りがあります。" + e.getMessage();
        }
        return null;
    }
}
