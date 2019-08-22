/**
 *
 * @author Rodrigo Leandro
 */
package lista01;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {

        int n1, n2;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        n1 = teclado.nextInt();

        System.out.print("Ente com o segundo número: ");
        n2 = teclado.nextInt();

        if (n1 > n2) {
            System.out.println(n2);
            System.out.println(n1);
        } else if (n2 > n1) {
            System.out.println(n1);
            System.out.println(n2);
        } else if (n1 == n2) {
            System.out.println(n1);
            System.out.println(n2);
        }
    }

}
