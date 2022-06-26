package com.RestApiTask.RestApiDemo.Form;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UpdateForm {
    @NotBlank
    @NotNull
    @Length(max = 20)
    private String movieTitle;

    @NotBlank
    @NotNull
    @Length(min = 4,max = 4)
    private String releaseYear;

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
}
