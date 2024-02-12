package com.esra.controller;

import com.esra.dto.RandevuDto;
import com.esra.service.RandevuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/randevular")
public class RandevuController {

    @Autowired
    private RandevuService randevuService;

    @GetMapping("/doktor/{doktorId}")
    public List<RandevuDto> getRandevularByDoktorAndTarih(@PathVariable Long doktorId, @RequestParam String tarih) {
        LocalDate randevuTarihi = LocalDate.parse(tarih);
        return randevuService.getRandevularByDoktorAndTarih(doktorId, randevuTarihi);
    }
}
