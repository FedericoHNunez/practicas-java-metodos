/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando_metodos;

/**
 *
 * @author fenu1
 */
public class Calculadora {
    
            private int a;
            private int b;

        public void Suma(){
            System.out.println((this.a+this.b)); 
        }


        public void setCalculadora (int a, int b){
         this.a=a;
         this.b=b;
        }    
         public int getA(){
            return this.a;   
         }
         public int getB(){
         return this.b;
         }
         
         

}
