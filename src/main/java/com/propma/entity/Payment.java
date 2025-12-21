package com.propma.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "payments")
public class Payment  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "Payment amount cannot be null")
    private Double amount;
    @NotBlank(message = "Payment status is mandatory")
    private String status;
    private Timestamp timeDateCreated;
    private Timestamp timeDateUpdated;
    private Timestamp timeDateCompleted;

}
