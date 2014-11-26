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
    public static int opcao,opcaoligar,opcaodispositivo;
    static  Scanner input = new Scanner(System.in);
    private static String opcaopainel = null;
    
    public static void main(String[] args){
     opcaopainel = JOptionPane.showInputDialog("Deseja iniciar o programa? \n");
     Main.opcaopainel=input.nextLine();
        
    System.out.println("Bem vindo");
    Ebook Livronovo = new Ebook();
    Kindle Kindle = new Kindle();
    Kobo Kobo = new Kobo();
    Editora JBC = new Editora();
    do{
       System.out.println("Deseja usar qual dispositivo? \n");
       System.out.println("1 - Kindle \n"); 
       System.out.println("2 - Kobo \n"); 
       opcaodispositivo = input.nextInt();
       switch(opcaodispositivo){
           case 1:
       System.out.println("Deseja ligar o dispositivo? \n");
       System.out.println("1 - Sim \n"); 
       System.out.println("2 - Não(Sai do programa) \n"); 
       opcaoligar = input.nextInt();
       switch(opcaoligar){
           case 1:
           System.out.println("Dispositivo ligado! \n");  
    do{
    Kindle.menu(opcao);
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
               
           case 2:
      do{
          do{
       System.out.println("Deseja ligar o dispositivo? \n");
       System.out.println("1 - Sim \n"); 
       System.out.println("2 - Não(Sai do programa) \n"); 
       opcaoligar = input.nextInt();
       switch(opcaoligar){
           case 1:
           System.out.println("Dispositivo ligado! \n");  
    Kobo.menu(opcao);
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