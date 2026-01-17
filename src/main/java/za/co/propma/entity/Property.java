package za.co.propma.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "properties")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Address is mandatory")
    private String address;

    private String description;
    private int unitNumber;
    private String electricityType;

    @NotBlank(message = "Property type is mandatory")
    private String type;

    private String insideColour;
    private int outsideColour;
    private int numberOfBedRooms;
    private int numberOfBathRooms;
    private int numberOfGarage;
    private int numberOfParking;
    private int numberOccupant;
    private boolean electricWall;
    private boolean petFriendly;
    private String gateAccessType;
    private String size;
    private String floorSize;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "landlord_id")
    private Landlord landlord;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_manager_id")
    private PropertyManager propertyManager;
}
