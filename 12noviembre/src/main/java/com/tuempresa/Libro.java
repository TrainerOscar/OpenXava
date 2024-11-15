package com.tuempresa;


import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.*;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

@Entity
public class Libro {

    @Id
    @GenericGenerator (name = "system-uuid", strategy = "uuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Hidden
    String codigo;
    @Column(length = 100, nullable = false) 
    @NotNull(message = "El ISBN es obligatorio")
    @Size (max = 100, message = "El ISBN no puede tener mas de 100 caracteres")
    String isbn;
    @Hidden
    @Size(max = 200, message = "El titulo es obligatorio")
    @NotNull(message = "El titulo no puede tener mas de 200 caracteres")
    String titulo;
    @Column(length = 100, nullable = false)
    @NotNull (message = "El autor es obligatorio")
    @Size (max = 100, message = "El autor no puede tener mas de 100 caracteres")
    String autor;
    @Column(nullable = false)
    @NotNull (message = "La fecha de publicacion es obligatoria") 
    @Size (max = 100, message = "El autor no puede tener mas de 100 caracteres")
    LocalDate fechaPublicacion;
}