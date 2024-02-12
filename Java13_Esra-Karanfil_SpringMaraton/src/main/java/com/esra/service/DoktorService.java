package com.esra.service;

import com.esra.dto.DoktorDto;
import com.esra.entity.Doktor;
import com.esra.mapper.DoktorMapper;
import com.esra.repository.DoktorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoktorService {

    @Autowired
    private DoktorRepository doktorRepository;

    public List<DoktorDto> getDoktorlarByBrans(String brans) {
        List<Doktor> doktorList = doktorRepository.findByBrans(brans);
        return DoktorMapper.INSTANCE.doktorListToDtoList(doktorList);
    }

}
