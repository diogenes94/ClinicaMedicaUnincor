/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.clinicamedicaunincor.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author dioge
 */
@Getter
@Setter
@Entity
@Table(name = "exames")
public class Exame {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_exame")
    private Integer idExame;
    
    @ManyToOne
    @JoinColumn(name = "id_consulta")
    private Consulta consulta;
    
    @ManyToOne
    @JoinColumn(name = "id_tipo_exame")
    private TipoExame tipoExame;
    private String resultado;
    
    @Column(name = "data_exame")
    private LocalDateTime dataExame;
    
}
