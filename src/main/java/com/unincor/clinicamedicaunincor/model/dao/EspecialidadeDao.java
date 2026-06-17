/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.clinicamedicaunincor.model.dao;

import com.unincor.clinicamedicaunincor.config.HibernateManager;
import com.unincor.clinicamedicaunincor.model.domain.Especialidade;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author dioge
 */
public class EspecialidadeDao extends AbstractDao<Especialidade>{
    
    public Especialidade buscarPorNome(String nomeParam) {
        var query = getEntityManager()
                .createQuery("from Especialidade e "
                        + "where e.nome = :nome");
        query.setParameter("nome", nomeParam);
        var resultados = query.getResultList();
        if(resultados == null || resultados.isEmpty()) {
            return null;
        }
        return (Especialidade) resultados.get(0);
    }
    
    
   
    
}
