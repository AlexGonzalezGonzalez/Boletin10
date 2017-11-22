
package boletin10_1;

import javax.swing.JOptionPane;

public class Comparacion extends NumeroAEscoger {
    
    public void comparar(){
        int num2,intentosnum;
        String intento,mayor,menor,intentos;
        
        intentos=JOptionPane.showInputDialog("Inserta numero de intentos");
        intentosnum=Integer.parseInt(intentos);
        
        intento=JOptionPane.showInputDialog("Adivina el numero");
        num2=Integer.parseInt(intento);
        
        int num3=num1-num2;
        while(num3!=0)    
        
        if(num3>0){
        mayor=JOptionPane.showInputDialog("Intentos "+intentosnum+"\nEl numero es mayor");
        num2=Integer.parseInt(mayor);
        intentosnum--;
          if (intentosnum==0)
            JOptionPane.showMessageDialog(null, "Perdiste");
          
        }
        
        else if (num3<0){
        menor=JOptionPane.showInputDialog("Intentos "+intentosnum+"\nEl numero es menor");
        num2=Integer.parseInt(menor);
        intentosnum--;
          if (intentosnum==0)
            JOptionPane.showMessageDialog(null, "Perdiste");
        
        }
        else
        JOptionPane.showMessageDialog(null, "Acertaste");
        
        
                
                
    }
}

