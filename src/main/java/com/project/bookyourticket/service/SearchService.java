package com.project.bookyourticket.service;

import com.project.bookyourticket.model.CinemaHall;
import com.project.bookyourticket.repository.CinemaHallQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SearchService {
    @Autowired
    private CinemaHallQuery cinemaHallQuery;

    public List getCinemaHalls(String city, String movieId, String date) {
        List cinemaHalls = cinemaHallQuery.getCinemaHallList(city, movieId, date);
        log.info("List of cinema halls : {}", cinemaHalls);

        return cinemaHalls;
    }

    public void saveCinemaHall(String city, String movieId, String date) throws Exception {
        CinemaHall cinemaHall = new CinemaHall(1, "cinema_hall_1", city, movieId, date);
        try {
            cinemaHallQuery.saveCinemaHall(cinemaHall);
        } catch (Exception ex) {
            throw new Exception("Unsuccessful to save cinema hall");
        }
    }
}
