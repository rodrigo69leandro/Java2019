/**
 *
 * @author Rodrigo Leandro
 */
package lista01;

import javax.swing.JOptionPane;


public class Questao09 {
    
    public static void main(String[] args) {
        
        
        int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Entre com a temperatura: "));
        
        int f;
        
       f= (temperatura*9/5)+32;   //((9*temperatura)/5)+32;
       
       JOptionPane.showMessageDialog(null, "A temperatura é de: " +f+ "°F ");
        
    }
   
    
}
