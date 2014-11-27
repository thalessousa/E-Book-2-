/*
 * Classe Main
 * 
 */
package Main;

import Biblioteca.Ebook;
import Biblioteca.Editora;
import Tablet.Kindle;
import Tablet.Kobo;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Thales Sousa
 */
 
public class Main {
    public static int opcao,opcaoligar;
    static  Scanner input = new Scanner(System.in);
    private static String opcaodispositivo = "1";
    
    public static void main(String[] args){
    System.out.println("Bem vindo");
    Ebook Livronovo = new Ebook();
    Kindle Kindle = new Kindle();
    Kobo Kobo = new Kobo();
    Editora JBC = new Editora();
    do{
       opcaodispositivo = JOptionPane.showInputDialog("Deseja usar qual dispositivo? \n1 - Kindle \n2 - Kobo \n");
       opcaodispositivo = input.nextLine();
       switch(opcaodispositivo){
           case "1":
       System.out.println("Deseja ligar o dispositivo? \n");
       System.out.println("1 - Sim \n"); 
       System.out.println("2 - Não(Sai do programa) \n"); 
       opcaoligar = input.nextInt();
       switch(opcaoligar){
           case 1:
           System.out.println("Dispositivo ligado! \n");  
    do{
    if( Kindle instanceof Kindle ){Kindle.menu(opcao);}
    switch(opcao){
        case 1:  
           Livronovo.setAtributos();
           break;
        case 2:
           Livronovo.imprimirdados();
           break;
        case 3:
           Kindle.ler();
           break;
        case 4:
           Kindle.paginaseguinte();
           break;
        case 5:
           Kindle.paginaanterior();
           break;
        case 6:
           Kindle.marcarpagina();
            break;
        case 7:
            JBC.impressaoeditora();
            break;
        case 8:
            Kindle.versao();
            break;
        case 9:
            Kindle.paginaaleatoria();
            break;
        case 10:
            Kindle.off();
            opcao=0;
            break;
    }
    }while(opcao!=0);
    break;
    }while(opcao!=0);
    
              break;
               
           case "2":
      do{
          do{
       System.out.println("Deseja ligar o dispositivo? \n");
       System.out.println("1 - Sim \n"); 
       System.out.println("2 - Não(Sai do programa) \n"); 
       opcaoligar = input.nextInt();
       switch(opcaoligar){
           case 1:
           System.out.println("Dispositivo ligado! \n");  
    if( Kobo instanceof Kobo ){Kobo.menu(opcao);}
    switch(opcao){
        case 1:  
           Livronovo.setAtributos();
           break;
        case 2:
           Livronovo.imprimirdados();
           break;
        case 3:
           Kobo.ler();
           break;
        case 4:
           Kobo.paginaseguinte();
           break;
        case 5:
           Kobo.paginaanterior();
           break;
        case 6:
           Kobo.marcarpagina();
            break;
        case 7:
            JBC.impressaoeditora();
            break;
        case 8:
            Kobo.versao();
            break;
        case 9:
            Kobo.paginaaleatoria();
            break;
         case 10:
            Kobo.off();
            opcao=0;
            break;
    }
    }
    }while(opcao!=0);
    break;
    }while(opcao!=0);
}
}while(opcao!=0);
}
}