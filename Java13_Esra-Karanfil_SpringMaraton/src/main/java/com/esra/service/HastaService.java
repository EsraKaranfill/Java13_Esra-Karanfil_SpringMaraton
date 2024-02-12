package com.esra.service;

import com.esra.dto.RandevuDto;
import com.esra.entity.Doktor;
import com.esra.entity.Hasta;
import com.esra.entity.Randevu;
import com.esra.repository.DoktorRepository;
import com.esra.repository.HastaRepository;
import com.esra.repository.RandevuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class HastaService {

    @Autowired
    private HastaRepository hastaRepository;

    @Autowired
    private RandevuService randevuService;
    @Autowired
    private DoktorRepository doktorRepository;

    private RandevuRepository randevuRepository;
    public void randevuAl(Long hastaId, Long doktorId, LocalDateTime randevuTarihi) {
        Hasta hasta = hastaRepository.findById(hastaId).orElseThrow(()->new NoSuchElementException("Hasta bulunamadı"));

        Doktor doktor = doktorRepository.findById(doktorId).orElseThrow(()->new NoSuchElementException("Hasta bulunamadı"));

        Randevu randevu = new Randevu();
        randevu.setHasta(hasta);
        randevu.setDoktor(doktor);
        randevu.setRandevuTarihi(randevuTarihi);

        randevuRepository.save(randevu);
    }

}