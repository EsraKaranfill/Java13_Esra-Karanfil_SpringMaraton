package com.esra.mapper;

import com.esra.dto.DoktorDto;
import com.esra.dto.RandevuDto;
import com.esra.entity.Doktor;
import com.esra.entity.Randevu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper
public interface RandevuMapper {

    RandevuMapper INSTANCE =  Mappers.getMapper(RandevuMapper.class);;

    DoktorDto map(Optional<Doktor> value);

    @Mapping(target = "doktor", source = "doktor")
    RandevuDto map(Randevu randevu);

    List<RandevuDto> randevuListToDtoList(List<Randevu> randevuList);
}