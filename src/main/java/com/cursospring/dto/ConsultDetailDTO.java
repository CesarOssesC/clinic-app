package com.cursospring.dto;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ConsultDetailDTO {
    
    @EqualsAndHashCode.Include
    private Integer idDetail;

    @JsonBackReference
    private ConsultDTO consult;

    @NotNull
    private String diagnosis;

    @NotNull
    private String treatment;
}
