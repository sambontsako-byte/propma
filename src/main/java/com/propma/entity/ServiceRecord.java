package com.propma.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "service_record")
public class ServiceRecord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String date;

    public ServiceRecord(Long id, String description, String date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }
}
