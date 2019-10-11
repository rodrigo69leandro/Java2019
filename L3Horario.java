package lista3;

import javax.swing.JOptionPane;

public class Horario {

    public static void main(String[] args) {

        int hora;
        int min;
        int segundos;
        int entrada;

        entrada = Integer.parseInt(JOptionPane.showInputDialog("Entre com os segundos:"));

        segundos = entrada % 60;
        min = entrada / 60;
        hora = min / 60;
        min = min % 60;

        JOptionPane.showMessageDialog(null, +hora + " Hora," + min + " min e " + segundos + " seg");
    }

}
