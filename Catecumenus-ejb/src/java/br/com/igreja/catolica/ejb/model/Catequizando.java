/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igreja.catolica.ejb.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Antonio
 */

@Table(name="catequizando")
@Entity
public class Catequizando implements Serializable{
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    Long id;
    @Column(name="nome")
    String nome;
    @Column(name="nome_mae")
    String nomeMae;
    @Column(name="nome_pai")
    String nomePai;
    @Temporal(TemporalType.DATE)
    @Column(name="data_nascimento")
    Date dataNascimento;
    @Column(name="naturalidade")
    String naturalidade;
    @Column(name="escolaridade")
    String escolaridade;
    @Column(name="email")
    String email;
    @Column(name="telefone")
    String telefone;
    @Column(name="endereco")
    String endereco;

    public Catequizando() {
    }

    public Catequizando(Long id, String nome, String nomeMae, String nomePai, Date dataNascimento, String naturalidade, String escolaridade, String email, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.dataNascimento = dataNascimento;
        this.naturalidade = naturalidade;
        this.escolaridade = escolaridade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Catequizando other = (Catequizando) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
   }
