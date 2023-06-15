/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constantes;

import java.util.Scanner;

/**
 *
 * @author fenu1
 */
public class Ejecucion {

   private static Scanner teclado = new Scanner(System.in);
   
   
    public static void main(String[] args) {
       
        Constante constante = new Constante();
        
        
        System.out.print("ingrese la edad de "+ constante.getNombre() );
        int edad = teclado.nextInt();
        constante.setEdad(edad);
        System.out.println("******************************");       
       
        
        
        teclado.close();
        
        constante.saludar();
        
       
        
        




    }
    
}
