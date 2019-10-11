package lista3;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double lista;
        double apresentacao;
        double prova;
        double media;

        System.out.print("Entre com a nota da Lista de exercícios:");
        lista = teclado.nextDouble();
        
        System.out.print("Entre com a nota da Apresentação do Seminário:");
        apresentacao = teclado.nextDouble();
        
        System.out.print("Entre com a nota da Prova final:");
        prova = teclado.nextDouble();
        
        media = ((lista * 2) + (apresentacao * 3) + (prova * 5)) / 10;
        
        System.out.println("Média Final:" + media);
        
        if (media >= 6) {
            System.out.println("Aprovado, parabéns");
        } else {
            System.out.println("Em construção");

        }

    }
}
