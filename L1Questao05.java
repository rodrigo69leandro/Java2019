/**
 * @author Rodrigo Leandro
 */
package lista01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Questao05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int resposta;
        int n1;
        int n2;

        String numero1 = JOptionPane.showInputDialog("Entre com o primeiro número: ");

        String numero2 = JOptionPane.showInputDialog("Entre com o segundo número:");

        n1 = Integer.parseInt(numero1);
        n2 = Integer.parseInt(numero2);

        resposta = n2 - n1;

        JOptionPane.showMessageDialog(null, "A diferença entre ele é " + resposta);

    }

}
