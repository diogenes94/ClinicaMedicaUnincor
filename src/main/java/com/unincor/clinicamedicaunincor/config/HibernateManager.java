/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.clinicamedicaunincor.config;

import com.unincor.clinicamedicaunincor.model.domain.Consulta;
import com.unincor.clinicamedicaunincor.model.domain.Especialidade;
import com.unincor.clinicamedicaunincor.model.domain.Exame;
import com.unincor.clinicamedicaunincor.model.domain.Medico;
import com.unincor.clinicamedicaunincor.model.domain.Paciente;
import com.unincor.clinicamedicaunincor.model.domain.TipoExame;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author dioge
 */
public class HibernateManager {
    
    private static Session session;
    
    public static Session getSession() {
        if(session == null) {
             StandardServiceRegistry ssr = 
                     new StandardServiceRegistryBuilder()
                     .configure("hibernate.cfg.xml")
                     .build();
             Metadata md = new MetadataSources(ssr)
                     .addAnnotatedClass(Consulta.class)
                     .addAnnotatedClass(Especialidade.class)
                     .addAnnotatedClass(Exame.class)
                     .addAnnotatedClass(Medico.class)
                     .addAnnotatedClass(Paciente.class)
                     .addAnnotatedClass(TipoExame.class)
                     .getMetadataBuilder().build();
             SessionFactory sessionFactory = md
                     .getSessionFactoryBuilder().build();
             session = sessionFactory.getCurrentSession();
        }        
        return session;
    }
    
    public static EntityManager getEntityManager() {
        var s = getSession();
        if(!s.getTransaction().isActive()) {
            s.beginTransaction();
        }
        return s.getEntityManagerFactory().createEntityManager();
    }
}
