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
public class Transacao {
    private String agencia;
    private String conta;
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private final TipoTransacao tipo;
    private final TipoConta tipoConta;
    private String agenciaDestino;
    private String contaDestino;
        
    public Transacao(String agencia, String conta, String nome, String endereco, String telefone, String cpf, TipoConta tipoConta, TipoTransacao tipo, String agenciaDestino, String contaDestino) throws Exception{
        setAgencia(agencia);
        setConta(conta);
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
        setCpf(cpf);        
        this.tipoConta = tipoConta;
        this.tipo = tipo;        
        
        if (tipo == TipoTransacao.Transferencia){
            setAgenciaDestino(agenciaDestino);
            setContaDestino(contaDestino);
        }
    }
    
    private void setAgencia(String agencia) throws Exception{
        if (agencia.isEmpty())
            throw new Exception("O campo \"Agência\" é obrigatório!");
        
        if (agencia.length() > 5)
            throw new Exception("O campo \"Agência\" deve ter no máximo 5 caracteres!");
        
        this.agencia = agencia;
    }
    
    private void setConta(String conta) throws Exception{
        if (conta.isEmpty())
            throw new Exception("O campo \"Conta\" é obrigatório!");
        
        if (conta.length() > 8)
            throw new Exception("O campo \"Conta\" deve ter no máximo 8 caracteres!");
        
        this.conta = conta;
    }
    
    private void setNome(String nome) throws Exception{
        if (nome.isEmpty())
            throw new Exception("O campo \"Nome\" é obrigatório!");
            
        this.nome = nome;
    }
    
    private void setEndereco(String endereco) throws Exception{
        if (endereco.isEmpty())
            throw new Exception("O campo \"Endereço\" é obrigatório!");
            
        this.endereco = endereco;
    }
    
    private void setTelefone(String telefone) throws Exception{
        if (telefone.isEmpty())
            throw new Exception("O campo \"Telefone\" é obrigatório!");
                            
        this.telefone = telefone;
    }
    
    private void setCpf(String cpf) throws Exception{
        if (cpf.isEmpty())
            throw new Exception("O campo \"CPF\" é obrigatório!");
            
        this.cpf = cpf;
    }
    
    private void setAgenciaDestino(String agencia) throws Exception{
        if (agencia.isEmpty())
            throw new Exception("O campo \"Agência\" do destinatário da transferência é obrigatório!");
        
        if (agencia.length() > 5)
            throw new Exception("O campo \"Agência\" do destinatário da transferência deve ter no máximo 5 caracteres!");
       
        this.agenciaDestino = agencia;
    }
    
    private void setContaDestino(String conta) throws Exception{
        if (conta.isEmpty())
            throw new Exception("O campo \"Conta\" do destinatário da transferência  é obrigatório!");
        
        if (conta.length() > 8)
            throw new Exception("O campo \"Conta\" do destinatário da transferência deve ter no máximo 8 caracteres!");
                
        this.contaDestino = conta;
    }
}
