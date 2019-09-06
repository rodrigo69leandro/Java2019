
package lista;

import java.util.Scanner;

public class OrdemInversa {
    
    public static void main(String[] args) {
       
       Scanner entrada = new Scanner(System.in);
        
        
        int[] v = new int[10];
        
       
        for(int cont = 0; cont < v.length; cont++){ // length é um atributo, mostra o tamanho do vetor
            System.out.println("Digite um número");
            v[cont] = entrada.nextInt();
        }
        
        System.out.println("O numero na ordem inversa é: ");
        for(int cont < v.length-1; cont >= 0; cont--)//ou < v.length 
        {
            
            System.out.println(v[cont]);
        }
        
        
        
    }
    
}
