
package Modificadores;





public class Clas_con_modicadores_de_acceso {

    private int edad;
    public String nombre;


    
    public Clas_con_modicadores_de_acceso (int edad, String nombre )
    {
        System.out.println("*******Ejecucion del Constructor*****");
        this.edad= edad;
        this.nombre=nombre;
    }

    Clas_con_modicadores_de_acceso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void hablar ()
    {
        System.out.println("");
        System.out.println("********** Hola ***********");
        System.out.println("Metodo hablar");
        System.out.println("");
    }
    
    
    private void saludar()     //solo pertenece a esta clase
    {
        System.out.println("");
        System.out.println("***** hola*****");
    }
    
    public void describir ()
    {
        saludar();  // llamo al metodo saludar dentro de un metodo publico para pasarlo mostrarlo
        System.out.println( this.nombre + " Tiene " + this.edad + " años");
        
    }
    
    
    
}
