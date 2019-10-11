package lista3;

import java.util.Scanner;

public class AuxilioGeografico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x;
        double inicial;
        double taxa;
        double esperado;

        System.out.print("População que se espera atingir? ");
        esperado = teclado.nextDouble();

        System.out.print("População inicial? ");
        inicial = teclado.nextDouble();

        System.out.print("Qual a taxa de crescimento populacional? ");
        taxa = teclado.nextDouble();

        x = (Math.log(esperado / inicial)) / (Math.log(1 + taxa));

        System.out.printf("O tempo estimado para o crescimento populacional esperado é de %.2f Anos \n" , x);

    }

}
