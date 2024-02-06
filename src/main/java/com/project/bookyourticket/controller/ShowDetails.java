package com.project.bookyourticket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShowDetails {

    @GetMapping("/showDetails/{showId}")
    public List<String> showDetails(@PathVariable("showId") String showId) {
        return List.of("seat1", "seat2", "seat3");
    }
}
