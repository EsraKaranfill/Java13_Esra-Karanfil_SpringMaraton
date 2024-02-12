package com.esra.mapper;

import com.esra.dto.DoktorDto;
import com.esra.dto.HastaDto;
import com.esra.dto.RandevuDto;
import com.esra.entity.Doktor;
import com.esra.entity.Hasta;
import com.esra.entity.Randevu;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-12T16:56:24+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 21 (Oracle Corporation)"
)
public class RandevuMapperImpl implements RandevuMapper {

    @Override
    public DoktorDto map(Optional<Doktor> value) {
        if ( value == null ) {
            return null;
        }

        DoktorDto.DoktorDtoBuilder doktorDto = DoktorDto.builder();

        return doktorDto.build();
    }

    @Override
    public RandevuDto map(Randevu randevu) {
        if ( randevu == null ) {
            return null;
        }

        RandevuDto.RandevuDtoBuilder randevuDto = RandevuDto.builder();

        randevuDto.doktor( map( randevu.getDoktor() ) );
        randevuDto.id( randevu.getId() );
        randevuDto.hasta( hastaToHastaDto( randevu.getHasta() ) );
        randevuDto.randevuTarihi( randevu.getRandevuTarihi() );

        return randevuDto.build();
    }

    @Override
    public List<RandevuDto> randevuListToDtoList(List<Randevu> randevuList) {
        if ( randevuList == null ) {
            return null;
        }

        List<RandevuDto> list = new ArrayList<RandevuDto>( randevuList.size() );
        for ( Randevu randevu : randevuList ) {
            list.add( map( randevu ) );
        }

        return list;
    }

    protected HastaDto hastaToHastaDto(Hasta hasta) {
        if ( hasta == null ) {
            return null;
        }

        HastaDto.HastaDtoBuilder hastaDto = HastaDto.builder();

        hastaDto.id( hasta.getId() );
        hastaDto.ad( hasta.getAd() );
        hastaDto.tani( hasta.getTani() );
        hastaDto.tedavi( hasta.getTedavi() );

        return hastaDto.build();
    }
}
