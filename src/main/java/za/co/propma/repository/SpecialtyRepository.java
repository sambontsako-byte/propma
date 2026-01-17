package za.co.propma.repository;

import za.co.propma.entity.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface
SpecialtyRepository extends JpaRepository<Specialty, Long> {
}
