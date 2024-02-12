package com.esra.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HastaDto {
    private Long id;
    private String ad;
    private String tani;
    private String tedavi;
}
