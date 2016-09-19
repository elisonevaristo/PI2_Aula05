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
public class Livro {
    private Editora editora;
    private String nome;
    private String autor;
    private String categoria;
    private int numeroPaginas;
    
    public Livro(Editora editora, String nome, String autor, String categoria, String numeroPaginas) throws Exception{
        setEditora(editora);
        setNome(nome);
        setAutor(autor);
        setCategoria(categoria);
        setNumeroPaginas(numeroPaginas);
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(Editora editora) throws Exception {
        if (editora == null)
            throw new Exception("É obrigatório informar a editora.");
        
        this.editora = editora;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) throws Exception {
        if (nome == null || nome.isEmpty())
            throw new Exception("É obrigatório informar o nome do livro.");
        
        this.nome = nome;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) throws Exception {
        if (autor == null || autor.isEmpty())
            throw new Exception("É obrigatório informar o autor do livro.");
        
        this.autor = autor;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) throws Exception {
        if (categoria == null || categoria.isEmpty() || categoria.equals("[Selecione...]"))
            throw new Exception("É obrigatório informar a categoria do livro.");
        
        this.categoria = categoria;
    }

    /**
     * @param numeroPaginas the numeroPaginas to set
     */
    public void setNumeroPaginas(String numeroPaginas) throws Exception {
        
        try
        {
            this.numeroPaginas = Integer.parseInt(numeroPaginas);
            
            if (this.numeroPaginas <= 0)
                throw new Exception("O número de páginas do livro deve ser maior que zero.");       
        }
        catch(NumberFormatException nfe)
        {
            throw new Exception("O número de páginas deve ser um valor numérico.");
        }        
    }
    
    public String getLivro(){
        return String.format("%s |%s |%s |%s |%s", this.editora.getNome(), this.nome, this.autor, this.categoria, this.numeroPaginas);
    }
}
