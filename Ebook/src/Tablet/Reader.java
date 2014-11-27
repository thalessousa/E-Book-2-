package Tablet;

import java.util.Scanner;

/*
 * Classe principal generica para o leitor de E-book
 * 
 */

/**
 *
 * @author Thales Sousa
 */
public abstract class Reader extends Tablet implements Tela {
        protected int paginaatual,paginamarcada;
        protected static  Scanner input = new Scanner(System.in);
        
    /*Construtor default */
    public Reader() {
    }
    /*Construtor puxando da super */
    public Reader(int id, String marca,int paginaatual, int paginamarcada) {
        super(id, marca);
        this.paginaatual = paginaatual;
        this.paginamarcada = paginamarcada;
    }
     /**
     *Lê a pagina atual até o usuario executar alguma ação
     */
    @Override
    public void ler(){
        System.out.println("Lendo o livro \n");
    }
    /**
     * Passa para a proxima pagina
     */
    public void paginaseguinte(){
    this.paginaatual = this.paginaatual + 1;
    System.out.println("Você esta na pagina"+this.paginaatual+ "\n");
    }
    /**
     *Retorna para a pagina anterior
     */
    public void paginaanterior(){
        this.paginaatual = this.paginaatual - 1;
        System.out.println("Você esta na pagina"+this.paginaatual+ "\n");
    }
    /**
     * Marca a pagina atual
     */
    public void marcarpagina(){
        this.paginamarcada = this.paginaatual;
        System.out.println("Pagina "+this.paginaatual+"marcada \n");
    }
}