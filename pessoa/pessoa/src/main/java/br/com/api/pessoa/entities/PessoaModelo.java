package br.com.api.pessoa.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pessoas")
public class PessoaModelo{

@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
private Long codigo ;
private String nome;
private Integer idade;
private String pais;
private String cidade;

  }
