/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igreja.catolica.ejb.model;

import java.util.Date;

/**
 *
 * @author Antonio
 */
public class Catequisando {
 
    String nome;
    String nomeMae;
    String nomePai;
    Date dataNescimento;
    String Naturalidade;
    String Escolaridade;
    String email;
    String telefone;
    String endereco;

    public Catequisando() {
    }

    public Catequisando(String nome, String nomeMae, String nomePai, Date dataNescimento, String Naturalidade, String Escolaridade, String email, String telefone, String endereco) {
        this.nome = nome;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.dataNescimento = dataNescimento;
        this.Naturalidade = Naturalidade;
        this.Escolaridade = Escolaridade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
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

    public Date getDataNescimento() {
        return dataNescimento;
    }

    public void setDataNescimento(Date dataNescimento) {
        this.dataNescimento = dataNescimento;
    }

    public String getNaturalidade() {
        return Naturalidade;
    }

    public void setNaturalidade(String Naturalidade) {
        this.Naturalidade = Naturalidade;
    }

    public String getEscolaridade() {
        return Escolaridade;
    }

    public void setEscolaridade(String Escolaridade) {
        this.Escolaridade = Escolaridade;
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
    
    
    
    
}
