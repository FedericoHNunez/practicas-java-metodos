
package Encasuplado;




public class Encapsulado {
   
    private float altura;
    private int edad ;    /*encapsulado se refiere a encerrar los atributos y metodos en la clase*/
    private String nombre; /*lo que resulta que para acceder a estos hay que invocarlos en un metodo publico*/
   
    
    public Encapsulado ()
    {
        System.out.println("*********************");
        
    }
    
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
