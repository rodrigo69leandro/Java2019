package lista3;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = 0;

        System.out.print("Digite um número: ");
        numero = teclado.nextInt();
        boolean primo = true;

        if (numero == 0 || numero == 1) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if ((numero % i) == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("O Numero " + numero + " é primo!");
        } else {
            System.out.println("Não é primo!");
        }
    }
}
