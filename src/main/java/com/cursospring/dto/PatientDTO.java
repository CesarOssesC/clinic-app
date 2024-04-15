package com.cursospring.dto;

import jakarta.validation.constraints.*;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PatientDTO {
    
    @EqualsAndHashCode.Include
    private Integer idPatient;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 70, message = "{firstname.size}")
    private String firstName;


    @NotNull
    @NotEmpty
    @Size(min = 3, max = 70, message = "{lastname.size}")
    private String lastName;

    private String dni;

    private String address;

    @Pattern(regexp = "[0-9]+")
    private String phone;

    @NotNull
    @NotEmpty
    @Email
    private String email;

}
