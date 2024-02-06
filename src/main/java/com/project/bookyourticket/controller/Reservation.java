package com.project.bookyourticket.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Reservation {

    @PostMapping("/reserveSeats/{showId}")
    public String reserveSeats(@PathVariable("showId") String showId,
                               @RequestBody List<String> seats) {
        return "status";
    }
}
