package com.project.bookyourticket.controller;

import com.project.bookyourticket.service.SearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class Search {
    @Autowired
    SearchService searchService;

    @GetMapping("/searchMovie/{userId}")
    public List searchMovie(@PathVariable("userId") String userId,
                                    @RequestParam("movie") String movie,
                                    @RequestParam("city") String city,
                                    @RequestParam("date") String date) {
        log.info("Search for all cinema halls available on date : {}, movie : {}, city : {}", date, movie, city);

        return searchService.getCinemaHalls(city, movie, date);
    }

    @GetMapping("/save/cinemaHall")
    public String saveCinemaHall(@RequestParam("movie") String movie,
                                 @RequestParam("city") String city,
                                 @RequestParam("date") String date) {
        log.info("Save cinema hall data : date : {}, movie : {}, city : {}", date, movie, city);

        try {
            searchService.saveCinemaHall(city, movie, date);
            return "Saved Successfully";
        } catch (Exception ex) {
            return "Unsuccessful save";
        }
    }
}
