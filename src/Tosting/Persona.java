

package Tosting;

public class Persona {
    public final int edad = 36 ;
    public final String nombre = "Federico";
    public float altura = 1.75f;

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", altura=" + altura + '}';
    }
    
    
   
    
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        String datosString= persona.toString();
        
        System.out.println(datosString);
                
    }
      
    
    
    
    
    
}
