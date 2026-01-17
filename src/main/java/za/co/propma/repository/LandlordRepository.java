package za.co.propma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.propma.entity.Landlord;

public interface LandlordRepository extends JpaRepository<Landlord, Long> {
}
