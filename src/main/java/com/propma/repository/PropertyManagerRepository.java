package com.propma.repository;

import com.propma.entity.PropertyManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyManagerRepository extends JpaRepository<PropertyManager, Long> {
}
