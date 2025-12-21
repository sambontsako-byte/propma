package com.propma.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
public class User implements Serializable {

    public User(Long id, String name, String lastname, String idNumber, LocalDate dateOfBirth, String email, String phoneNumber, String workContactNumber, String address, String role, String profession, String emergencyContactName, String emergencyContactNumber, String emergencyContactRelationship, LocalDateTime dateTimeOnboarded, String password) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.idNumber = idNumber;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.workContactNumber = workContactNumber;
        this.address = address;
        this.role = role;
        this.profession = profession;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactNumber = emergencyContactNumber;
        this.emergencyContactRelationship = emergencyContactRelationship;
        this.dateTimeOnboarded = dateTimeOnboarded;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 2, max = 40, message = "Name must be between 2 and 40 character")
    @Pattern(regexp = "[^0-9]*", message = "Name must not contain numbers")
    @NotBlank(message = "Name is mandatory field")
    private String name;

    @Size(min = 2, max = 40, message = "lastname must be between 2 and 40 character")
    @Pattern(regexp = "[^0-9]*", message = "Name must not contain numbers")
    @NotBlank(message = "Lastname is mandatory field")
    private String lastname;

    @NotNull(message = "ID Number cannot be null")
    private String idNumber;
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email cannot be blank")

    @Past(message = "Date of birth must be in the past")
    private LocalDate dateOfBirth;
    @Email
    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotNull(message = "Phone number cannot be null")
    private String phoneNumber;
    private String workContactNumber;
    @NotBlank(message = "Address is mandatory")
    private String address;
    @NotBlank(message = "Role is mandatory")
    private String role;
    private String profession;
    private String emergencyContactName;
    private String emergencyContactNumber;
    private String emergencyContactRelationship;

    private LocalDateTime dateTimeOnboarded;
    @Size(min = 8, max = 255, message = "Password must be between 8 and 255 characters")
    private String password;
}
