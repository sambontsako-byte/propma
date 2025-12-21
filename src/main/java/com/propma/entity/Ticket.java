package com.propma.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "tickets")
public class Ticket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Heading is mandatory")
    private String heading;
    @NotBlank(message = "Description is mandatory")
    private String description;
    private String status;
    @NotBlank(message = "Address is mandatory")
    private String address;
    @NotBlank(message = "Priority is mandatory")
    private String priority;

    private Timestamp timeDateCreated;
    private Timestamp timeDateUpdated;
    private Timestamp timeDateCompleted;


    public Ticket(Long id, String heading, String description, String status, String address, String priority, Timestamp timeDateCreated, Timestamp timeDateUpdated, Timestamp timeDateCompleted) {
        this.id = id;
        this.heading = heading;
        this.description = description;
        this.status = status;
        this.address = address;
        this.priority = priority;
        this.timeDateCreated = timeDateCreated;
        this.timeDateUpdated = timeDateUpdated;
        this.timeDateCompleted = timeDateCompleted;
    }
}
