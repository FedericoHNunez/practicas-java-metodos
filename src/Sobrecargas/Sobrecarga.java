
package Sobrecargas;
/*
Puedo crear todos metodos que quiera con el mismo nombre
lo que los va a diferenciar los son parametros que les envio

*/

public class Sobrecarga {
  
    public  Sobrecarga (int edad)
    {
        System.out.println(" La edad es:" + edad);
        
    }
    
    public Sobrecarga ( int km, String nombre)
    {
        System.out.println("La persona nombre: "+ nombre+ " corre "+km);
    }
    
    public Sobrecarga ( float altura)
    {
        System.out.println("La altura de la persona es: "+ altura);
    }
    
    
    public void saludar ()
    {
        System.out.println("************************");
        System.out.println("Hola");   
    }
    
    public void saludar (String nombre)
    {
        System.out.println("*************************");
        System.out.println("Hola "+ nombre);
    }
    
    
    
}



