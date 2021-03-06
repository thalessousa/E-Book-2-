package Biblioteca;

/*
 * Classe livro generica com quantidade de paginas do livro,nome do livro e autor.
 * 
 */

/**
 *
 * @author Thales Sousa
 */
public abstract class Livro {

    protected int isbn;
    protected static String ano;
    protected String autor,nomedolivro;
    protected static final int PAGINAINICIAL= 1;
    
    public Livro() {
        this.isbn = 0;
        this.autor = "desconhecido";
        this.nomedolivro = "desconhecido";
    } 
    /*Construtor de inicialização pelo usuario*/
    public Livro(int isbn, String autor, String nomedolivro) {
        this.isbn = isbn;
        this.autor = autor;
        this.nomedolivro = nomedolivro;
    }
    /*Construtor default*/
    public Livro(Livro copia) {
        this.isbn = copia.isbn;
        this.autor = copia.autor;
        this.nomedolivro = copia.nomedolivro;
    } 
    public void setAtributos() {
        System.out.println("Insira o isbn");
        this.isbn = isbn;
        System.out.println("Insira o autor do livro");
        this.autor = autor;
        System.out.println("Insira o nome do livro");
        this.nomedolivro = nomedolivro;
    }   
    public void imprimirdados(String s){
        System.out.println(s);
    }

    @Override
    public String toString() {
        String s = "Livro{" + "isbn=" + isbn + ", autor=" + autor + ", nomedolivro=" + nomedolivro + '}';
        return s;
    }
}