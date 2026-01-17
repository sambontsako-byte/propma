package za.co.propma.repository;

import za.co.propma.entity.PropertyManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyManagerRepository extends JpaRepository<PropertyManager, Long> {
}
