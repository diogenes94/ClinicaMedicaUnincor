/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.clinicamedicaunincor.model.dao;

import com.unincor.clinicamedicaunincor.model.domain.Paciente;

/**
 *
 * @author dioge
 */
public class PacienteDao extends AbstractDao<Paciente>{
    
    public static void main(String[] args) {
        new PacienteDao().buscarTodos().forEach(System.out::println);
    }
    
}
