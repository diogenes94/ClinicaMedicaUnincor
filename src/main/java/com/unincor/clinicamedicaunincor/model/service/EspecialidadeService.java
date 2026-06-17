/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.clinicamedicaunincor.model.service;

import com.unincor.clinicamedicaunincor.exception.CadastroException;
import com.unincor.clinicamedicaunincor.model.dao.EspecialidadeDao;
import com.unincor.clinicamedicaunincor.model.domain.Especialidade;
import java.sql.SQLException;

/**
 *
 * @author dioge
 */
public class EspecialidadeService {

    private EspecialidadeDao especialidadeDao = new EspecialidadeDao();

    public void salvar(Especialidade especialidade)
            throws CadastroException {
        /* Testa se o nome da especialidade está em branco */
        if (especialidade.getNome() == null
                || especialidade.getNome().trim().isBlank()) {
            throw new CadastroException("A especialidade informada não possui nome");
        }
        /* Pesquisando a especialidade a ser salva pelo nome no BD */
        var especialidadeConsulta = especialidadeDao
                .buscarPorNome(especialidade.getNome());
        if (especialidade.getIdEspecialidade() == null
                && especialidadeConsulta != null) {
            throw new CadastroException("A especialidade "
                    + especialidade.getNome() + " já existe!");
        }

        especialidadeDao.salvar(especialidade);
    }

    public static void main(String[] args) {
        EspecialidadeService especialidadeService = new EspecialidadeService();

        Especialidade esp = new Especialidade();

        try {
            especialidadeService.salvar(esp);
        } catch (CadastroException ex) {
            System.getLogger(EspecialidadeService.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

}
