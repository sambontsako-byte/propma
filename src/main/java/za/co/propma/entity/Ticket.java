package za.co.propma.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "tickets")
public class Ticket  {

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "landlord_id")
    private Landlord landlord;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_provider_id")
    private ServiceProvider serviceProvider;
}
