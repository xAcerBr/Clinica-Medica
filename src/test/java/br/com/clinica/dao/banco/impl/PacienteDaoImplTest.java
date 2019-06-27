/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao.banco.impl;

import br.com.clinica.domain.Endereco;
import br.com.clinica.domain.Paciente;
import br.com.clinica.domain.Sexo;
import br.com.clinica.domain.Telefone;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author Henrique Baron
 */
public class PacienteDaoImplTest {

    private PacienteDaoImpl dao;

    public PacienteDaoImplTest() {
        dao = new PacienteDaoImpl();
    }

    /**
     * Test of findPaciente method, of class PacienteDaoImpl.
     */
    @Test
//    @Ignore
    public void testFindPaciente() {
        Paciente paciente = new Paciente();
        paciente.setNome("Henrique");
        paciente.setCpf("186.200.191-23");
        paciente.setDataNascimento(new Date(System.currentTimeMillis()));
        paciente.setSexo(Sexo.MASCULINO);
        paciente.setEmail("henrique@gmail.com");
        paciente.setEndereco(new Endereco("88131-743", "Braulina Goulart", "48", "RioGrande", "", "SC"));
        paciente.setTipoSanguineo("O+");
        List<Telefone> telefones = new ArrayList();
        telefones.add(new Telefone("(48)996850323", "Celular", "João", "Irmão", true));
        telefones.add(new Telefone("(48)996850323", "Celular", "Henrique", "Pai", true));
        paciente.setTelefones(telefones);

        dao.salvar(paciente);
    }

    @Test
    public void listarPoTermo() {
        List<Paciente> pacientes = dao.listar();
        for (Paciente paciente : pacientes) {
            System.out.println(paciente.getTelefones());
        }

    }

}
