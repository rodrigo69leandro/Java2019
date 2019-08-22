/**
 * @author Rodrigo Leandro
 */
package lista01;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        
        Scanner teclado= new Scanner(System.in);
        
        int numero;
        
        System.out.print("Entre com um número: ");
        numero = teclado.nextInt();
        
        if(numero>10){
            System.out.println("Maior");
        } 
        else 
            System.out.println("Menor");
        
    }
    
}
