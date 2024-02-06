package com.project.bookyourticket.controller;

import com.project.bookyourticket.model.Movie;
import com.project.bookyourticket.repository.MovieQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class Search {
    @Autowired
    MovieQuery movieQuery;

    @GetMapping("/searchMovie/{movieName}/{id}")
    public List<String> searchMovie(@PathVariable("movieName") String movieName,
                                    @PathVariable("id") int id,
                                    @RequestParam("city") String city,
                                    @RequestParam("date") String date) {
        log.info("enter search movie");
        Movie movie = new Movie();
        movie.setName(movieName);
        movie.setId(id);
        movieQuery.saveMovie(movie);
        log.info("Movie : {}", movie);
        return List.of("show1", "show2", "show3");
    }
}
