package Constantes;

public class Constante {
 
   private final String nombre = "federico" ;   // "FINAL° el atributo nunca cambiara
   private int edad;
   private final int id = 1234;
   
   
   public void saludar ()
   {
       System.out.println("Mi nombre es  "+ nombre);
       System.out.println("Mi edad es " + edad);
       System.out.println("Mi id es: " + id);
   }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
   
    
   
   
   
   
   
   
}
