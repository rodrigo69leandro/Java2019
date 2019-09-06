package lista;


import java.util.Scanner;

public class OrdemCrescente {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maior = 0;
        int medio = 0;
        int menor = 0;

        System.out.print("Entre com o numero:");
        maior = teclado.nextInt();

        System.out.print("Entre com o numero:");
        medio = teclado.nextInt();

        System.out.print("Entre com o numero:");
        menor = teclado.nextInt();

        if (maior < medio) {
            if (medio < menor) {
                System.out.println("A ordem crescente dos numeros digitados foram:");
                System.out.println(maior);
                System.out.println(medio);
                System.out.println(menor);
            } else if (medio < menor) {
                if (medio < menor) {
                    System.out.println("A ordem crescente dos numeros digitados foram:");
                    System.out.println(maior);
                    System.out.println(menor);
                    System.out.println(medio);
                } else {
                    System.out.println("A ordem crescente dos numeros digitados foram:");
                    System.out.println(menor);
                    System.out.println(maior);
                    System.out.println(medio);

                }

            }

        }
    
    }
}
