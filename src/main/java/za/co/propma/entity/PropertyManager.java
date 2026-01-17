package za.co.propma.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@DiscriminatorValue("PROPERTY_MANAGER")
public class PropertyManager extends User {

    @OneToMany(mappedBy = "propertyManager", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Property> properties;
}
