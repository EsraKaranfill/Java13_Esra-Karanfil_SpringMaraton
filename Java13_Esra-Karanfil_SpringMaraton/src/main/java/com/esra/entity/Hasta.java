package com.esra.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hasta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ad;
    private String tani;

    private String tedavi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTani() {
        return tani;
    }

    public void setTani(String tani) {
        this.tani = tani;
    }

    public String getTedavi() {
        return tedavi;
    }

    public void setTedavi(String tedavi) {
        this.tedavi = tedavi;
    }
}
