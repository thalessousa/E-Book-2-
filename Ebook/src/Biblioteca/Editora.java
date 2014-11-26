/*
 * Classe Editora que guarda os livros publicados.
 * 
 */
package Biblioteca;
import java.util.ArrayList;
/**
 *
 * @author Thales Sousa
 */
public class Editora extends Serviço {
    private ArrayList<Ebook>listadelivros;
    public Editora(int cnpj, String nome, String tipo) {
        super(cnpj, nome, tipo);
    } 
     public Editora(Ebook Livronovo) {
        listadelivros.add(Livronovo);
 }  
     /*Construtor default */
    public Editora() {
      this.listadelivros = listadelivros; 
    }
    public void impressaoeditora(){
        int i,n=listadelivros.size();
             for (i=0;i<n;i++) {
                 System.out.println("Livros que a editora ja publicou"+listadelivros.get(i));
             }
    }
}