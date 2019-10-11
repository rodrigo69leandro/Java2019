package lista3;

public class Fibonacci {

    public static void main(String[] args) {

        long a = 1;
        long b = 0;
        long aux;

        for (int cont = 0; cont < 50; cont++) {
            System.out.println(a);
            aux = a;
            a += b;
            b = aux;

        }
    }

}
