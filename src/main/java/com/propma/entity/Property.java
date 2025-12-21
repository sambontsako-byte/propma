package com.propma.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name="properties")
public class Property implements Serializable {
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

    public Property(Long id, String address, String description, int unitNumber, String electricityType, String type, String insideColour, int outsideColour, int numberOfBedRooms, int numberOfBathRooms, int numberOfGarage, int numberOfParking, int numberOccupant, boolean electricWall, boolean petFriendly, String gateAccessType, String size, String floorSize) {
        this.id = id;
        this.address = address;
        this.description = description;
        this.unitNumber = unitNumber;
        this.electricityType = electricityType;
        this.type = type;
        this.insideColour = insideColour;
        this.outsideColour = outsideColour;
        this.numberOfBedRooms = numberOfBedRooms;
        this.numberOfBathRooms = numberOfBathRooms;
        this.numberOfGarage = numberOfGarage;
        this.numberOfParking = numberOfParking;
        this.numberOccupant = numberOccupant;
        this.electricWall = electricWall;
        this.petFriendly = petFriendly;
        this.gateAccessType = gateAccessType;
        this.size = size;
        this.floorSize = floorSize;
    }
}
