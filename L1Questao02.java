/**
 * @author Rodrigo Leandro
 */
package lista01;


public class Questao02{
    
public static void main(String[] args) {
        int x = 2;
        int y = 4;
        if (x < 3) {
            if (y > 5) {
                System.out.println("escreve um");
            } else {
                System.out.println("escreve dois");
            }
        } else {
            if (y < 5) {
                System.out.println("escreve tres");
            } else {
                System.out.println("escreve quatro");
            }
        }
    }
}

/*
Podemos observar que o IF(x<3) é verdadeiro, portanto ele executa e dentro dele existe 
*       outro IF(y>5), ele é falso,então a resposta é "escreve dois".
*   Alternativa B
*/

