package com.esra.mapper;

import com.esra.dto.DoktorDto;
import com.esra.entity.Doktor;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-12T16:56:24+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 21 (Oracle Corporation)"
)
@Component
public class DoktorMapperImpl implements DoktorMapper {

    @Override
    public List<DoktorDto> doktorListToDtoList(List<Doktor> doktorList) {
        if ( doktorList == null ) {
            return null;
        }

        List<DoktorDto> list = new ArrayList<DoktorDto>( doktorList.size() );
        for ( Doktor doktor : doktorList ) {
            list.add( doktorToDoktorDto( doktor ) );
        }

        return list;
    }

    protected DoktorDto doktorToDoktorDto(Doktor doktor) {
        if ( doktor == null ) {
            return null;
        }

        DoktorDto.DoktorDtoBuilder doktorDto = DoktorDto.builder();

        return doktorDto.build();
    }
}
