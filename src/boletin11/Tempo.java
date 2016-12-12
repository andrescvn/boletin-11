/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import javax.swing.JOptionPane;




/**
 *
 * @author acomesanavila
 */
public class Tempo {
   public String frase (){
       System.out.println("Escribe a seguinte frase: \n A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .");
       String frase="A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .";
       System.out.println("Preme enter o rematar");
       return frase;
   }
   public String escribir (){
  String frase=JOptionPane.showInputDialog("Empeza");
   return frase;
     }
}
