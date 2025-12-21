package com.propma.repository;

import com.propma.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRecordRepository extends JpaRepository<ServiceProvider, Long> {
}
