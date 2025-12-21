package com.propma.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "property_managers")
public class PropertyManager extends User implements Serializable {

    private List<Property> properties;

    public PropertyManager(Long id, String name, String lastname, String idNumber, LocalDate dateOfBirth, String email, String phoneNumber, String workContactNumber, String address, String role, String profession, String emergencyContactName, String emergencyContactNumber, String emergencyContactRelationship, LocalDateTime dateTimeOnboarded, String password) {
        super(id, name, lastname, idNumber, dateOfBirth, email, phoneNumber, workContactNumber, address, role, profession, emergencyContactName, emergencyContactNumber, emergencyContactRelationship, dateTimeOnboarded, password);
    }
}
