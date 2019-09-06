/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class ExponenPropria {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
       int num;
       int calc;
        System.out.println("Entre com o numero:");
        num=teclado.nextInt();
        
        calc= num*num;
        
        System.out.println("O resultado é: "+ calc);
        
        
    }
}
