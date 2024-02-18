package com.project.bookyourticket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="user_details")
@Data
public class User {
    @Id
    private String userId;
    private String phoneId;
    private String emailId;
}
