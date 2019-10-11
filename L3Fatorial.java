package lista3;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont = 0;
        int num;
        int calc;

        System.out.print("Entre com o numero para ser fatorado: ");
        num = teclado.nextInt();

        calc = num;

        while (num > 1) {
            calc = calc * (num - 1);
            num--;
        }
        
        System.out.println("Resultado da fatoração:" + calc);

    }

}
