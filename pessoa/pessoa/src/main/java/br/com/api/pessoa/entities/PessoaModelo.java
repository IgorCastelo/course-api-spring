package br.com.api.pessoa.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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

@NotBlank(message = "Nome invalido!")
@Size(min = 3, max = 30, message = "O nome deve ter entre 3 e 30 caracteres.")
private String nome;

@NotNull(message = "Idade invalida!")
@Min(value = 0, message = "A idade minima permitida é 0.")
@Max(value = 120, message = "A idade maxima permitida é 120.")
private Integer idade;

@NotBlank(message = "Pais invalido!")
@Size(min = 3, max = 30, message = "O nome do pais deve ter entre 3 e 30 caracteres.")
private String pais;

@NotBlank(message = "Cidade invalida!")
@Size(min = 3, max = 30, message = "O nome da cidade deve ter entre 3 e 30 caracteres.")
private String cidade;

  }
