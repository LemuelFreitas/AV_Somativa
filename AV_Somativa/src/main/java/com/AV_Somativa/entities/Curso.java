package com.AV_Somativa.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Curso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull

	private String nome;
	
	@NotNull

	private double cargaHoraria;
	
	@NotNull

	private String conteudoProgramatico;
	
	@NotNull

	private Double Valor;
	
	@NotNull

	private String Professor;
}