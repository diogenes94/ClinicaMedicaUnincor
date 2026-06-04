/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.clinicamedicaunincor.model.dao;

import com.unincor.clinicamedicaunincor.config.HibernateManager;
import com.unincor.clinicamedicaunincor.model.domain.Especialidade;
import jakarta.persistence.EntityManager;

/**
 *
 * @author dioge
 */
public class EspecialidadeDao extends AbstractDao<Especialidade>{
    
    
    
    public static void main(String[] args) {
        var e1 = new Especialidade();
        e1.setNome("Cardiologista");
        
        var especialidadeDao = new EspecialidadeDao();
        System.out.println(especialidadeDao.salvar(e1));
        
    }
    
}
