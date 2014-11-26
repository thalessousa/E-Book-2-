package Tablet;

import Main.Main;
import java.util.Random;
/*
 * Classe Kindle que herda as funções de Reader com @Override
 * 
 */
/**
 *
 * @author Thales Sousa
 */
public class Kindle extends Reader implements Device,Comparable {

    @Override
    public int compareTo(Object outro) {
        return 0;
    }
    
    private enum atualizacoes {GINGERBREAD,HONEYCOMB,FROYO,CUPCAKE};  
    private atualizacoes versao;
    
    /*Construtor puxando da super */
    public Kindle(int id, String marca, int paginaatual, int paginamarcada) {
        super(id, marca, paginaatual, paginamarcada);
    }
    /*Construtor default */
    public Kindle() {
    }

    public void setIdeMarca(int id,String marca) {
        this.id = id;
        this.marca = marca;
    }  
    
    public void versao(){
        System.out.println("Versao atual do Kindle e "+atualizacoes.GINGERBREAD);
    }
    public void pagina(){
      this.paginaatual = super.paginaatual;
    }
    @Override
    public void on(){
        System.out.println("Dispositivo ligado! \n");
    }
    @Override
    public void off(){
        System.out.println("Dispositivo desligado! \n");
    }
    @Override
    public void ler() {
        super.ler();
    }
    @Override
    public void marcarpagina() {
        super.marcarpagina();
    }
    @Override
    public void paginaseguinte() {
        super.paginaseguinte();
    }
    @Override
    public void paginaanterior() {
        super.paginaanterior();
    }
    public void paginaaleatoria(){
    Random gerador = new Random();
    super.paginaatual= gerador.nextInt(700);
    System.out.println("O livro agora esta na pagina "+super.paginaatual+"\n");
    }
    public static void menu(int opcao){
        System.out.println("1 - Inserir as informacoes de um livro \n ");
        System.out.println("2 - Imprime as informacoes de um livro \n ");
        System.out.println("3 - Le o Ebook \n ");
        System.out.println("4 - Passa para  a proxima pagina \n ");
        System.out.println("5 - Volta para a pagina anterior \n ");
        System.out.println("6 - Marca a pagina atual \n"); 
        System.out.println("7 - Imprimir a lista de livros da editora \n");
        System.out.println("8 - Versao do sistema \n");
        System.out.println("9 - Ir para uma pagina aleatoria do livro \n");
        System.out.println("10 - Desligar o dispositivo(Sai do Programa) \n");
        Main.opcao = input.nextInt();
    }
}