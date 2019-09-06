
package lista;

import javax.swing.JOptionPane;

public class SomarNumeros {

    public static void main(String[] args) {

        int num, soma = 0;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

            if (num >= 0) {
                soma = num + soma;

            }
        } while (num > 0);

        JOptionPane.showMessageDialog(null, "A soma é: " + soma);

    }
}
