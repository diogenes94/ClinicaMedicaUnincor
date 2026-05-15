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
public class Exame {
    
    private Integer idExame;
    private Consulta consulta;
    private TipoExame tipoExame;
    private String resultado;
    private LocalDateTime data;
    
}
