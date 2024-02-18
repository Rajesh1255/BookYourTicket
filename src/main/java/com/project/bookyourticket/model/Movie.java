package com.project.bookyourticket.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="movie")
@Data
public class Movie {
    @Id
    private String movieId;
    private String title;
    private String description;
    private String duration;
    private String language;
    private String releaseDate;
    private String country;
    private String genre;
}
