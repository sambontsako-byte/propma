package com.propma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "tenants")
public class Tenant extends User implements Serializable {
    private List<Lease> leases;
    private List<Ticket> tickets;

    private List<ServiceRecord> serviceRecords;

    public Tenant(Long id, String name, String lastname, String idNumber, LocalDate dateOfBirth, String email, String phoneNumber, String workContactNumber, String address, String role, String profession, String emergencyContactName, String emergencyContactNumber, String emergencyContactRelationship, LocalDateTime dateTimeOnboarded, String password) {
        super(id, name, lastname, idNumber, dateOfBirth, email, phoneNumber, workContactNumber, address, role, profession, emergencyContactName, emergencyContactNumber, emergencyContactRelationship, dateTimeOnboarded, password);
    }
}
