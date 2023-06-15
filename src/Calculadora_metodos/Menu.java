
package Calculadora_metodos;

import java.util.Scanner;

public class Menu {
  
    private int seleccion;
    private double numero1;
    private double numero2;
    Scanner teclado= new Scanner(System.in);       
    
   public void mostrarMenu ()
   {
       System.out.println("*******************************");
       System.out.println(" CALCULADORA");
       System.out.println("*******************************");
       System.out.println("");
       System.out.println("SUMAR------ 1");
       System.out.println("RESTAR----- 2");
       System.out.println("MULTIPLICAR 3");
       System.out.println("DIVIDIR---- 4");
       System.out.print("SALIR---------0");
       System.out.println("");
       System.out.println("********************************");
       
       
   } 
   
   public void seleccion (){
       System.out.print("***: ");
       this.seleccion= teclado.nextInt(); 
   }

    public int getSeleccion() {
        return this.seleccion;
    }
   
   public void ingresar(){
       
       System.out.print("Ingrese primer numero: ");
       this.numero1= teclado.nextDouble();
       
       System.out.print("\nIngrese segundo numero: ");
       this.numero2=teclado.nextDouble();
   }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
  

}
