package com.project.bookyourticket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="booking")
@Data
public class Booking {
    @Id
    private String bookingId;
    private String userId;
    private String showId;
    private int noOfSeat;
}
