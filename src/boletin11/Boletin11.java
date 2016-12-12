/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Date;



/**
 *
 * @author acomesanavila
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tempo tempo= new Tempo();
        String frase=tempo.frase();
        long inicio= System.currentTimeMillis();
        String frase1=tempo.escribir();
        long end = System.currentTimeMillis();
        if (frase.equals(frase1))
        System.out.println("Has tardado:"+(end - inicio)/1000 +" segundos");
        else {
        System.out.println("Has fallado");    
        } 
    java.util.Date fecha = new Date();
    System.out.println (fecha);
    }
    
}
