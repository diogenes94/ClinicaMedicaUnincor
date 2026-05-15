/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.clinicamedicaunincor.model.domain;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author dioge
 */
@Getter
@Setter
public class Consulta {
    
    private Integer idConsulta;
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataConsulta;
    private StatusConsulta status;
    private String observacoes;
    
    
}
