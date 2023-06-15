
package MetodoMontructor;

import java.util.Scanner;
/*
se llama igual que la clase
es el primer metodo en ejecutarse
se ejecuta en forma automatica cuando llamamos al objeto
no devuelve ningun valor ni si quiera void
pueden existir varios siguiendo los metodos de sobrecarga
solo se ejecutara al crear el objeto

*/
public class Constructor {
    
 int array[];
 
 
 public Constructor (int elementos)
 {
     this.array= new int[elementos];
     Scanner teclado= new Scanner (System.in);
     
     for (int i = 0; i < this.array.length; i++) 
     {
         System.out.print(" Ingrese numero: ");
         this.array[i]= teclado.nextInt();
         
     }     
 }
    
 public void imprimir ()
 {
     System.out.println("****************************************************");
     for (int i = 0; i < this.array.length; i++)
     {
         System.out.println("El numero en la pos " + i + " es: " + this.array[i]);
     }
    
 }        
 
 
}
 
 
 
 

