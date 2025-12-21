package com.propma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@Table(name = "leases")
public class Lease  implements Serializable {
    private Timestamp leaseStartDate;
    private Timestamp leaseEndDate;
    @NotNull(message = "Rent amount cannot be null")
    private double rentAmount;
    @NotNull(message = "Deposit amount cannot be null")
    private double depositAmount;
    private double otherDepositAmount;
    private boolean leaseSigned;
    private boolean leaseStatus;
    private boolean address;
    private List<Payment> payments;
}
