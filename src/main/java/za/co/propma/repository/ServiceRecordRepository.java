package za.co.propma.repository;

import za.co.propma.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRecordRepository extends JpaRepository<ServiceProvider, Long> {
}
