package com.unincor.clinicamedicaunincor.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author dioge
 */
@Getter
@Setter
@Entity
@Table(name = "pacientes")
@ToString
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Integer idPaciente;
    private String nome;
    private String cpf;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    private String telefone;
    private String endereco;
    
    
}
