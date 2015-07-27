/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igreja.catolica.ejb.enuns;

/**
 *
 * @author Antonio
 */
public enum Sacramento {
    
    BATISMO("Batismo"), EUCARISTIA("1ª Eucaristia") ,CRISMA ("Crisma"), CONFISSAO ("Confissão"),MATRIMONIO("Matrimônio") ,ORDEM ("Ordem"),UNCAO("Unção dos Enfermos");

    private final String descricao;
    
    private Sacramento(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
    return descricao;
    }


    
}
