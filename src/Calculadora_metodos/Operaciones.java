
package Calculadora_metodos;

public class Operaciones {
    
    private double numero1;
    private double numero2;
    private double resultado;
    
    public double suma()
    {
     return resultado= numero1+numero2;
    }
     public double resta()
    {
     return resultado = numero1-numero2;
    }
     public double multi()
    {
     return resultado = numero1*numero2;
    }
     public double div()
    {
     
        if ( numero2 != 0)
        {
        return resultado= numero1 / numero2;
        }
        else
        {
        return 0;
        }
       
    }

    public double getResultado() {
        return resultado;
    }
    
 
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
     
     
     
}
