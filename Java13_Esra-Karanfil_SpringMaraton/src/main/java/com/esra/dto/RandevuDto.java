package com.esra.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RandevuDto {
    private Long id;
    private DoktorDto doktor;
    private HastaDto hasta;
    private LocalDateTime randevuTarihi;
}
