package com.project.bookyourticket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="seat_arrangement")
@Data
public class SeatArrangement {
    @Id
    private String showId;
    @Id
    private String seatId;
}
