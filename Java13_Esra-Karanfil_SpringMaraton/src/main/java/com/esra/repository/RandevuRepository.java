package com.esra.repository;

import com.esra.entity.Doktor;
import com.esra.entity.Randevu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RandevuRepository extends JpaRepository<Randevu, Long> {
    List<Randevu> findByDoktorAndRandevuTarihi(Doktor doktor, LocalDate randevuTarihi);

}
