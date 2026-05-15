/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.clinicamedicaunincor.model.domain;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author dioge
 */
@Getter
@Setter
public class Medico {
    
    private Integer idMedico;
    private String nome;
    private String crm;
    private String telefone;
    private Especialidade especialidade;
    
}
