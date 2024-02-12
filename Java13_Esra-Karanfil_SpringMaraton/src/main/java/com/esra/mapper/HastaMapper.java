package com.esra.mapper;

import com.esra.entity.Hasta;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface HastaMapper {
    HastaMapper INSTANCE = Mappers.getMapper(HastaMapper.class);

}
