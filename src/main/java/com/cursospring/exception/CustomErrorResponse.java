package com.cursospring.exception;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomErrorResponse {
    //manejo de errores custom
    //definen formato.
    private LocalDateTime dateTime;
    private String message;
    private String details;
}
