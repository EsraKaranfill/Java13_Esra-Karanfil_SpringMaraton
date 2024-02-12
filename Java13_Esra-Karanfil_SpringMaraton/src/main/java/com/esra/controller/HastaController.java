package com.esra.controller;

import com.esra.dto.RandevuDto;
import com.esra.service.HastaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/hastalar")
public class HastaController {

    @Autowired
    private HastaService hastaService;

    @PostMapping("/randevu")
    public void randevuAl(@RequestBody Long hastaId, Long doktorId, LocalDateTime randevuTarihi) {
        hastaService.randevuAl(hastaId,doktorId,randevuTarihi);
    }

}