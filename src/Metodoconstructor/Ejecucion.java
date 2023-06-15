
package MetodoMontructor;

import javax.swing.JOptionPane;


public class Ejecucion {

    
     
    public static void main(String[] args) {
        
        int elementos;
        
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de elementos:"));
        Constructor constructor = new Constructor(elementos);
        constructor.imprimir();
        
        
        
       
    } 
}
