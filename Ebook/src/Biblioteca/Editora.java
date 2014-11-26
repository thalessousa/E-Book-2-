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
     public Editora(Ebook novo) {
        this.listadelivros.add(novo);
 }  
     /*Construtor default */
    public Editora() {
      this.listadelivros = listadelivros; 
    }
    public void impressaoeditora(){
      for(int i=0;i<this.listadelivros.size();i++){
        System.out.println("Livros que a editora ja publicou %s");     
    }
    }
}