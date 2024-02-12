package com.esra.controller;

import com.esra.dto.DoktorDto;
import com.esra.service.DoktorService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doktorlar")
public class DoktorController {
    @Autowired
    private DoktorService doktorService;

    @GetMapping
    public List<DoktorDto> getDoktorlarByBrans(@RequestParam String brans) {
        return doktorService.getDoktorlarByBrans(brans);
    }
}
