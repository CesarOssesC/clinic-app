package com.cursospring.dto;


import java.time.LocalDateTime;
import java.util.List;

import com.cursospring.model.Medic;
import com.cursospring.model.Patient;
import com.cursospring.model.Specialty;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ConsultDTO {
    
    @EqualsAndHashCode.Include
    private Integer idConsult;

    @NotNull
    private Patient patient;

    @NotNull
    private Medic medic;

    @NotNull
    private Specialty specialty;
    
    @NotNull
    private String numConsult;

    @NotNull
    private LocalDateTime consutlDate;

    @JsonManagedReference
    @NotNull
    private List<ConsultDetailDTO> details;
}
