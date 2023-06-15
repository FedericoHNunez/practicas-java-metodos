/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encasuplado;

import javax.swing.JOptionPane;

/**
 *
 * @author fenu1
 */
public class ejecucion {
    
    public static void main(String[] args) {
        
        int edad;
        String nombre;
        float altura;
        
        Encapsulado encapsulado = new Encapsulado();
        
        edad= Integer.parseInt(JOptionPane.showInputDialog("INGRESE EDAD"));
        nombre = JOptionPane.showInputDialog("INGRESE NOMBRE");
        altura = Float.parseFloat(JOptionPane.showInputDialog("INGRESE ALTURA"));
        
        encapsulado.setEdad(edad);
        encapsulado.setNombre(nombre);
        encapsulado.setAltura(altura);
        
        
        
        System.out.println("El nombre es: " + encapsulado.getEdad());
        System.out.println("La edad es: " + encapsulado. getNombre());
        System.out.println("Ela altura es: " + encapsulado.getAltura());
        
        
        
        
                
        
        
        
        
    }
    
    
}
