/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author Thales
 */
public abstract class Serviço {
    protected int cnpj;
    protected String nome,tipo;
    /*Construtor */
    public Serviço(){
    }
    public Serviço(int cnpj, String nome, String tipo) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.tipo = tipo;
    }
}
