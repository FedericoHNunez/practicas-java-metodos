
package Calculadora_metodos;


public class Calculadora {

   
    public static void main(String[] args) {
        int seleccion = 0;
        
        Operaciones operaciones = new Operaciones();
        Menu menu = new Menu();
        
        menu.mostrarMenu();
        menu.seleccion();

        menu.ingresar();
        operaciones.setNumero1(menu.getNumero1());
        operaciones.setNumero2(menu.getNumero2());
        
 
        
       System.out.println("");
       seleccion= menu.getSeleccion();
       
        
          
                   if( seleccion==1){
                   System.out.println("La suma es: "+ operaciones.suma());
             }else if(seleccion==2){
                   System.out.println("La resta es: "+ operaciones.resta());
             }else if (seleccion ==3){    
                   System.out.println("El producto es: "+ operaciones.multi());
             }else if (seleccion==4){
                   System.out.println("La division es: "+ operaciones.div());
             }else{     
                   System.out.println("Selecion no valida");
             } 
        
        
       
       
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
