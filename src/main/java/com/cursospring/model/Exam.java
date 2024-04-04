package com.cursospring.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Exam {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idExam;

    @Column(length = 70, nullable = false)
    private String name;

    @Column(length = 200, nullable = false)
    private String description;

}
