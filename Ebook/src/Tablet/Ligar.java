/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author thalessousa
 */

public class Ligar
{
  public static void opcao(String[] args)
  {
    JFrame frame = new JFrame("Kindle");
    int resposta = JOptionPane.showConfirmDialog(frame,"Ligar dispositivo?", "Kindle", JOptionPane.YES_NO_OPTION);
    if (resposta == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Dispositivo ligado!");
      }
      else {
         JOptionPane.showMessageDialog(null, "Dispositivo desligado!");
         System.exit(0);
      }
    System.exit(0);
  }
}