package com.esra.repository;

import com.esra.entity.Doktor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoktorRepository extends JpaRepository<Doktor,Long> {
    List<Doktor> findByBrans(String branş);
}
