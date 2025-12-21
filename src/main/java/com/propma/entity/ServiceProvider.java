package com.propma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "service_providers")
public class ServiceProvider extends User implements Serializable {
    @NotBlank(message = "Business name is mandatory")
    private String businessName;
    private String businessRegistrationNumber;
    private List<Specialty> specialties;
    private List<Ticket> tickets;

    public ServiceProvider(Long id, String name, String lastname, String idNumber, LocalDate dateOfBirth, String email, String phoneNumber, String workContactNumber, String address, String role, String profession, String emergencyContactName, String emergencyContactNumber, String emergencyContactRelationship, LocalDateTime dateTimeOnboarded, String password) {
        super(id, name, lastname, idNumber, dateOfBirth, email, phoneNumber, workContactNumber, address, role, profession, emergencyContactName, emergencyContactNumber, emergencyContactRelationship, dateTimeOnboarded, password);
    }
}
