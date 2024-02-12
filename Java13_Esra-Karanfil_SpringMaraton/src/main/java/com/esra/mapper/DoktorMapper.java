package com.esra.mapper;

import com.esra.dto.DoktorDto;
import com.esra.entity.Doktor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DoktorMapper {
    DoktorMapper INSTANCE = Mappers.getMapper(DoktorMapper.class);

    List<DoktorDto> doktorListToDtoList(List<Doktor> doktorList);
}
