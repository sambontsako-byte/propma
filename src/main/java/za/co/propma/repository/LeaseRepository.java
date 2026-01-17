package za.co.propma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.propma.entity.Lease;

public interface LeaseRepository extends JpaRepository<Lease, Long> {
}
