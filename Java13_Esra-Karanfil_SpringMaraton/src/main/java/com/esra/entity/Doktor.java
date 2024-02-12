package com.esra.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Doktor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String ad;
    private String brans;
}
