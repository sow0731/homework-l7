package com.rest.api.task.rest.api.demo;

public class MovieInfo {
    private int movieId;
    private String title;
    private String year;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public MovieInfo(int movieId, String title, String year) {
        this.movieId = movieId;
        this.title = title;
        this.year = year;
    }
}
