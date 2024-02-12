package com.esra.service;

import com.esra.dto.RandevuDto;
import com.esra.entity.Doktor;
import com.esra.entity.Randevu;
import com.esra.mapper.RandevuMapper;
import com.esra.repository.DoktorRepository;
import com.esra.repository.RandevuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class RandevuService {

    @Autowired
    private RandevuRepository randevuRepository;
    private DoktorRepository doktorRepository;

    public List<RandevuDto> getRandevularByDoktorAndTarih(Long doktorId, LocalDate randevuTarihi) {
        Doktor doktor = doktorRepository.findById(doktorId)
                .orElseThrow(() -> new NoSuchElementException("Doktor bulunamadı"));
        List<Randevu> randevuList = randevuRepository.findByDoktorAndRandevuTarihi(doktor, randevuTarihi);
        return RandevuMapper.INSTANCE.randevuListToDtoList(randevuList);
    }

}