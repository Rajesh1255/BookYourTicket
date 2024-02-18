package com.project.bookyourticket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="show")
@Data
public class Show {
    @Id
    private String showId;
    private String cinemaHallId;
    private String date;
    private String movieId;
    private String time;
}
