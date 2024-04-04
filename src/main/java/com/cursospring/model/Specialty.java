package com.cursospring.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idSpecialty;

    @Column(length = 70, nullable = false)
    private String name;

    @Column(length = 150, nullable = false)
    private String description;
}
