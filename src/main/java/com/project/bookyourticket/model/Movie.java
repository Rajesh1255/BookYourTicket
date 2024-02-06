package com.project.bookyourticket.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="movie")
@Data
public class Movie {
    @Id
    private int id;
    private String name;
    private String duration;
}
