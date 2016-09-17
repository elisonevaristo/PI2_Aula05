/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula05;

/**
 *
 * @author roger
 */
public class Usuario {
    final private String nome;
    final private int idade;
    final private String sexo;
    final private String estadoCivil;
    final private String rg;
    final private String cpf;
    
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    
    private String email;
    private String telefone;
    private String celular;
            
    public Usuario(String nome, String idade, String sexo, String estadoCivil, String rg, String cpf) throws NumberFormatException, Exception {
        
        if (nome.isEmpty())
            throw new Exception("O nome do usuário é obrigatório.");
        if (idade.isEmpty())
            throw new Exception("A idade do usuário é obrigatória.");
        if (sexo.isEmpty())
            throw new Exception("O sexo do usuário é obrigatório.");
        if (estadoCivil.isEmpty())
            throw new Exception("O estado civil do usuário é obrigatório.");
        if (rg.isEmpty())
            throw new Exception("O RG do usuário é obrigatório.");
        if (cpf.isEmpty())
            throw new Exception("O cpf do usuário é obrigatório.");
        
        this.nome = nome;        
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.rg = rg;
        this.cpf = cpf;
        
         try 
         { 
             this.idade = Integer.parseInt(idade); 
             
             if (this.idade < 0 || this.idade > 120)
                 throw new Exception("A idade deve estar entre 0 e 120 anos.");
         }
         catch(NumberFormatException e)
         {
             throw new NumberFormatException("A idade deve ser numérica.");
         }
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return String.valueOf(numero);
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) throws NumberFormatException {
        try
        {
            this.numero = Integer.parseInt(numero);
        }
        catch(NumberFormatException nfe)
        {
            throw new NumberFormatException("O número deve ter um valor numérico.");
        }
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
}
