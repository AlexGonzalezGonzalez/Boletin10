
package boletin10_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class NumeroAEscoger {
    public int num1;
    
    String introducir,error;
    public void insertaNumeroAElegir(){
        
        introducir=JOptionPane.showInputDialog("Teclea numero");
        num1=Integer.parseInt(introducir);
    }
        public void validar(){
        while(num1<1 || num1>50){
            error=JOptionPane.showInputDialog("Numero erroneo\nEntre 1 y 50");
            num1=Integer.parseInt(error);
        }
    }
}


        
            
    


    


