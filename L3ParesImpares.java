package lista3;

import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int entrada[] = new int[10];
        int par = 0;
        int impar = 0;
        int pares = 0,im = 0;

        for (int cont = 0; cont < 10; cont++) {

            System.out.print("Entre com o numero: ");
            entrada[cont] = teclado.nextInt(); 

         if (entrada[cont] % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
           pares+= par;
           im+=impar;
        }
        System.out.println("Foram digitados "+par+" numeros pares");
        System.out.println("Foram digitados "+impar+" numeros impares");
    }

}
//IF EM DIANTE TEM QUE PERMANECER FORA DO FOR IT, PORÉM O CONT ESTÁ APENAS NO LOCAL DO FOR 