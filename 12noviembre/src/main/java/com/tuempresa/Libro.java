package com.tuempresa;

import java.time.LocalDate;

import javax.persistence.*;
import javax.persistence.Entity;
import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator (name = "system-uuid", strategy = "uuid")
    @Hidden
    String codigo;
    @Column(length = 50) @Required 
    String isbn;
    @Column(length = 100)@Required
    String titulo;
    @Column(length = 100)@Required
    String autor;
    @Required
    LocalDate fechaPublicacion;
}