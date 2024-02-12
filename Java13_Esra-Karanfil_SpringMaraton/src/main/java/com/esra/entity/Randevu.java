package com.esra.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Optional;

@Entity
public class Randevu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "doktor_id")
    private Doktor doktor;

    @ManyToOne
    @JoinColumn(name = "hasta_id")
    private Hasta hasta;

    private LocalDateTime randevuTarihi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Optional<Doktor> getDoktor() {
        return Optional.ofNullable(doktor);
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }

    public LocalDateTime getRandevuTarihi() {
        return randevuTarihi;
    }

    public void setRandevuTarihi(LocalDateTime randevuTarihi) {
        this.randevuTarihi = randevuTarihi;
    }
}
