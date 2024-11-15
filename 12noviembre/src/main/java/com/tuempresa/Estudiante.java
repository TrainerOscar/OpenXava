package com.tuempresa;


import javax.persistence.*;
import javax.validation.constraints.*;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Estudiante {
	@Id
	@Column (length = 8)
	String cif;
	@Column (length = 100)
	String nombre;
	@Column(length = 100)
	String carrera;
	@Size (min = 10, message ="el email debe de tener al menos 10 caracteres")
	@Required
	@Stereotype ("EMAIL")
	String email;
	
}