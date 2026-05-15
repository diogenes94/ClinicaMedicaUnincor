package com.unincor.clinicamedicaunincor.model.domain;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author dioge
 */
@Getter
@Setter
public class Paciente {
    
    private Integer idPaciente;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;
    private String endereco;
    
    
}
