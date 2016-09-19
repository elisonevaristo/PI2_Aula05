/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula05;

/**
 *
 * @author Roger
 */
public class Editora {
    private String nome;
        
    public Editora(String nome) throws Exception {
        if (nome.isEmpty())
            throw new Exception("A editora precisa ter um nome válido.");
        
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
}
