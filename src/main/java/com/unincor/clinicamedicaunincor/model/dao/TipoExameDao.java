/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.clinicamedicaunincor.model.dao;

import com.unincor.clinicamedicaunincor.model.domain.TipoExame;

/**
 *
 * @author dioge
 */
public class TipoExameDao extends AbstractDao<TipoExame>{
    
    
    
    public static void main(String[] args) {
//        var tpe = new TipoExame();
//        tpe.setDescricao("Curva glicemica");
//        
//        var tipoExameDao = new TipoExameDao();
//        System.out.println(tipoExameDao.salvar(tpe));

        var tipoExameDao = new TipoExameDao();
        tipoExameDao.buscarTodos().forEach(System.out::println);
    }
}
