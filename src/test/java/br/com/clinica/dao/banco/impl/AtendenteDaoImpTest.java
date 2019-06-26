/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao.banco.impl;

import br.com.clinica.domain.Atendente;
import br.com.clinica.domain.Endereco;
import br.com.clinica.domain.Sexo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author Henrique Baron
 */
public class AtendenteDaoImpTest {

    private AtendenteDaoImp dao;
    private Atendente atendente;

    public AtendenteDaoImpTest() {
        dao = new AtendenteDaoImp();
        atendente = new Atendente();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    @Ignore
    public void salvar() {

        atendente = new Atendente();
        atendente.setNome("João");
        atendente.setCpf("186.402.198-23");
        atendente.setDataNascimento(new Date(System.currentTimeMillis()));
        atendente.setSexo(Sexo.M);
        atendente.setEmail("henrique@gmail.com");
        atendente.setEndereco(new Endereco("88131-743", "Braulina Goulart", "48", "RioGrande", "", "SC"));
        atendente.setTipoSanguineo("O+");
        atendente.setTelefone("48996850323");

        dao.salvar(atendente);
    }

    @Test
    @Ignore
    public void exluir() {
        atendente = dao.buscar(1);
        dao.excluir(atendente);
    }

    @Test
//    @Ignore
    public void listar() {
        List<Atendente> atendentes = dao.listar();
        for (Atendente atendente1 : atendentes) {
            System.out.println(atendente1.getNome());
        }
    }
}