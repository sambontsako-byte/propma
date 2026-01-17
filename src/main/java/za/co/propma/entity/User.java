package za.co.propma.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 2, max = 40, message = "Name must be between 2 and 40 characters")
    @Pattern(regexp = "[^0-9]*", message = "Name must not contain numbers")
    @NotBlank(message = "Name is a mandatory field")
    private String name;

    @Size(min = 2, max = 40, message = "Lastname must be between 2 and 40 characters")
    @Pattern(regexp = "[^0-9]*", message = "Lastname must not contain numbers")
    @NotBlank(message = "Lastname is a mandatory field")
    private String lastname;

    @NotNull(message = "ID Number cannot be null")
    private String idNumber;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is a mandatory field")
    private String email;

    @Past(message = "Date of birth must be in the past")
    private LocalDate dateOfBirth;

    @NotNull(message = "Phone number cannot be null")
    private String phoneNumber;

    private String workContactNumber;

    @NotBlank(message = "Address is a mandatory field")
    private String address;

    @NotBlank(message = "Role is a mandatory field")
    private String role;

    private String profession;
    private String emergencyContactName;
    private String emergencyContactNumber;
    private String emergencyContactRelationship;

    private LocalDateTime dateTimeOnboarded;

    @Size(min = 8, max = 255, message = "Password must be between 8 and 255 characters")
    private String password;
}
