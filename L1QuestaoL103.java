/**
 * @author Rodrigo Leandro
 */
package lista01;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nome1;
        String nome2;
        
        System.out.print("Entre com a primeiro nome: ");
        nome1 = teclado.next();
        
        System.out.print("Entre com a segundo nome: ");
        nome2=teclado.next();
        
        System.out.println(nome2 +" e " +nome1);
        
    }
    
}
