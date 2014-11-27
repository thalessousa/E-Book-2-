package Biblioteca;
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thales Sousa
 */
public class Ebook extends Livro {
    
    private int numerodepaginas;
    private static int paginamarcada;
    static Scanner input = new Scanner(System.in);
    
    /*Construtor vazio */
    public Ebook() {
    }
    /*Construtor default */
    public Ebook(int numerodepaginas, int isbn, String autor, String nomedolivro) {
        super(isbn, autor, nomedolivro);
        this.numerodepaginas = numerodepaginas;
    }
    /*Construtor de copia */
    public Ebook(int numerodepaginas, Livro copia) {
        super(copia);
        this.numerodepaginas = numerodepaginas;
    }
    @Override
    public void setAtributos() {
        System.out.println("Insira o numero de paginas do livro");
        this.numerodepaginas = input.nextInt();
        if(this.numerodepaginas <0){
            System.out.println("Numero de paginas invalido,insira novamente \n");
            this.numerodepaginas = input.nextInt();
        }
        System.out.println("Insira o isbn \n");
        this.isbn = input.nextInt();
        if(this.isbn <0){
            System.out.println("Numero ISBN invalido,insira novamente \n");
            this.isbn = input.nextInt();
        }
        System.out.println("Insira o autor do livro");
        this.autor = input.next(); 
        if(this.autor.contains("^[a-Z]")){
                System.out.println("Autor valido \n"); 
        }
        System.out.println("Insira o nome do livro \n");
        this.nomedolivro = input.nextLine();
        if(this.nomedolivro.contains("^[a-Z]")){
                System.out.println("Nome de livro valido \n");
        }
        System.out.println("Insira o ano de publicacao do livro(Formato Dia Mes Ano) \n");
        Ebook.ano = input.next();
                if(Ebook.ano.contains("^[1,2,3,4,5,6,7,8,9,0]")){
                System.out.println("Data valida \n");
                }
    }   
     public static void marcarpagina(){
         System.out.println("Insira a pagina atual de leitura \n");
         Ebook.paginamarcada = input.nextInt();
     }
     public void imprimirdados(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        String s=" Isbn "+super.isbn+" \n Autor do Livro "+super.autor+" \n Nome do Livro \n"+super.nomedolivro+ " Data de publicacao \n "+Ebook.ano;
        return s;
    }

}