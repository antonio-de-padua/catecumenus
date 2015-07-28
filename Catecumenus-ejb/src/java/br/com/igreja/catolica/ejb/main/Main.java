package br.com.igreja.catolica.ejb.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.igreja.catolica.ejb.model.Catequizando;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Antonio
 */
public class Main {
    
    public static void main(String[] args) {
    EntityManagerFactory entityManegerFactory = Persistence.createEntityManagerFactory("catecumenusPU");
    EntityManager entityManager = entityManegerFactory.createEntityManager();
    
    entityManager.getTransaction().begin();
    
    Catequizando ct = new Catequizando();
    ct.setNome("Antonio");
    ct.setNomePai("bento");
    ct.setNomeMae("albertina");
    ct.setDataNascimento(new Date());
    ct.setEmail("paduafil@gmail.com");
    ct.setEndereco("Avenida Higino Cunha");
    ct.setEscolaridade("Superior");
    ct.setNaturalidade("teresina");
    ct.setTelefone("88888888");
    entityManager.persist(ct);
    entityManager.getTransaction().commit();
    entityManager.close();
            
    
        
    }
            
    
    
}
