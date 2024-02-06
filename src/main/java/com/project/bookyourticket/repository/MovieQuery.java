package com.project.bookyourticket.repository;

import com.project.bookyourticket.model.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MovieQuery {
    @Autowired
    private MovieRepository movieRepository;

    public void saveMovie(Movie movie) {
        try {
            movieRepository.save(movie);
        } catch(Exception ex) {
            log.debug("Unsuccessful to save : {}", ex.getMessage());
        }
    }
}
