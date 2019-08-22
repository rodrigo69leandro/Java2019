/**
 *
 * @author Rodrigo Leandro
 */
package lista01;

import javax.swing.JOptionPane;

public class Questao06 {
    
    public static void main(String[] args) {
        
        String numero1 = null;
        String numero2 = null;
        int n1;
        int n2;
        int resultado;
        
        numero1 = JOptionPane.showInputDialog("Entre com o primeiro número: ");
        n1 = Integer.parseInt(numero1);
        
       numero2 =  JOptionPane.showInputDialog("Entre com o segundo número: ");
        n2= Integer.parseInt(numero2);
        
        resultado= n2-n1;
        
        if(resultado<10){
            JOptionPane.showMessageDialog(null," Menor ");
            
        }
        else if(resultado <10){
            JOptionPane.showMessageDialog(null," Maior ");
        
    }
        else if(resultado == 10)
            System.out.println("Igual");
    
}
}

