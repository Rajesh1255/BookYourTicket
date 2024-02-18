package com.project.bookyourticket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cinema_hall")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemaHall {
    @Id
    private int id;
    @Column(name="cinema_hall_id")
    private String cinemaHallId;
    @Column(name="city")
    private String city;
    @Column(name="movie_id")
    private String movieId;
    @Column(name="date")
    private String date;
}
