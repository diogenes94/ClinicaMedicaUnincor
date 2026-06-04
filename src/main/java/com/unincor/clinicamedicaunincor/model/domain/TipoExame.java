package com.unincor.clinicamedicaunincor.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "tipos_exame")
@ToString
public class TipoExame {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_exame")
    private Integer idTipoExame;
    private String descricao;
    
}
