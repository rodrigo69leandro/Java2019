package lista;

/* Escreva um programa que receba 10 numeros e armazene-os em um array. 
Depois calcule a soma e a media dos valores armazenados neste array.*/


import java.util.Scanner;

public class Array10Numeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double num[] = new double[10];
        double soma = 0;

        for (int contador = 0; contador < 10; contador++) {

            System.out.println("Entre com o numero: ");
            num[contador] = teclado.nextDouble();

            soma = soma + num[contador];

        }
        
        System.out.println("A soma dos numeros é " + soma);

    }

}
