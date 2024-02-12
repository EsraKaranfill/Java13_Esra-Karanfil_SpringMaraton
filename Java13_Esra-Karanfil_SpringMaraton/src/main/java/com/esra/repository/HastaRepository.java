package com.esra.repository;

import com.esra.entity.Hasta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HastaRepository extends JpaRepository<Hasta, Long> {
}
