/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_exception_propagation;

/**
 *
 * @author invitado
 */
public class EVA3_2_EXCEPTION_PROPAGATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Inicia main");
        A();
        System.out.println("Termina main");
    }
       public static void A(){
           
           System.out.println("Iniciamos A");
           B();
           System.out.println("Terminamos A");
       }
        public static void B(){
           System.out.println("Iniciamos B");
           C();
           System.out.println("Terminamos B");
       }
         public static void C(){
             System.out.println("Iniciamos C");
             int x = 5 , y = 0;
             int resu = x / y;
           System.out.println("Resultado =" + resu);
           System.out.println("Terminamos C");
       }
    }
    

