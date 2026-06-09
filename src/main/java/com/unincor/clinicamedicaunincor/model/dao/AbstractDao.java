/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.clinicamedicaunincor.model.dao;

import com.unincor.clinicamedicaunincor.config.HibernateManager;
import jakarta.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 *
 * @author dioge
 * @param <T>
 */
public abstract class AbstractDao<T> {
    
    private Class<T> aClass;

    private EntityManager entityManager;

    public AbstractDao() {
        reflection();
    }    

    protected EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManager = HibernateManager.getEntityManager();
        }
        return entityManager;
    }

    public T salvar(T value) {
        getEntityManager().getTransaction().begin();
        T valueSaved = getEntityManager().merge(value);
        getEntityManager().getTransaction().commit();
        return valueSaved;
    }

    public List<T> buscarTodos() {
        return getEntityManager().createQuery("from " 
                + aClass.getSimpleName()).getResultList();
                
    }
    
    public T findById(Integer id) {
        return getEntityManager().find(aClass, id);
    }
    
    public void delete(T value) {
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(value);
        getEntityManager().getTransaction().commit();
    }
    
    public void delete(Integer id) {
        T value = findById(id);
        delete(value);
    }

    private void reflection() {
        aClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

}
