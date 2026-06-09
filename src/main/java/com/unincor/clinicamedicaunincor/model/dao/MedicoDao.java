/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.clinicamedicaunincor.model.dao;

import com.unincor.clinicamedicaunincor.model.domain.Especialidade;
import com.unincor.clinicamedicaunincor.model.domain.Medico;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author dioge
 */
public class MedicoDao extends AbstractDao<Medico>{
    
    public List<Medico> buscarPorEspecialidade(Especialidade especialidade) {
        Query query = getEntityManager()
                .createQuery("select m from Medico m join m.especialidade "
                        + "where m.especialidade = ?1 order by m.nome")
                .setParameter(1, especialidade);
        
        return query.getResultList();
        
    }
}
