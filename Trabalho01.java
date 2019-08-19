 package trabalho01;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Leandro
 * @version 1.0
 * 
 */

public class Trabalho01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int pagamento;
        int proximo = 0;
        int forma;
        int novamente = 0;
        int parcelas;
        int qntvezes;
        float somaprodutos = 0;
        float preco;
        float qntvezes2, qntvezes3;
        float calculodescontodin;
        float calculodescontoche;
        float desconto;
        float troco = 0;
        float recebido = 0;

        
        // Repetir todo o processo novamente
        while (proximo < 500) {

            System.out.println("BEM VINDO AO SUPERMERCADO IRINEU\n");
        //Repetição para inserir os produtos
            do {
                System.out.println("Entre com o produto: ");
                System.out.println("Finalizar digite:0 ");
                preco = entrada.nextFloat();

                if (preco >= 0) {
                    somaprodutos = preco + somaprodutos;

                }
            } while (preco > 0);// repetir a quantidade

            System.out.println("Valor total: " + somaprodutos);
            System.out.println("\n");
            System.out.println("Qual forma de pagamento:");
            System.out.println("1-Dinheiro");
            System.out.println("2-Cheque");
            System.out.println("3-Cartão de credito");
            pagamento = entrada.nextInt();
                //Pagamento a vista com 10% de desconto
            switch (pagamento) {
                case 1:

                    System.out.println("Opção escolhida: Dinheiro \n");

                    calculodescontodin = (10 * somaprodutos) / 100;
                    desconto = somaprodutos - calculodescontodin;

                    System.out.printf(" Total com desconto: %.2f \n", desconto);
                    System.out.print("Valor recebido: ");
                    recebido = entrada.nextFloat();

                    troco = recebido - desconto;

                    System.out.printf("Troco: %.2f \n", troco);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {

                    }
                    System.out.println("Obrigado pela preferencia");
                    System.out.println("volte sempre");
                    break;

                //Paragamento em Cheque com 5% de desconto, se for em 1 parcela 
                case 2:

                    System.out.println("Forma de pagamento: Cheque ");

                    qntvezes2 = somaprodutos / 2;
                    qntvezes3 = somaprodutos / 3;

                    System.out.println("1x de " + somaprodutos);
                    System.out.printf("2x de %.2f\n", qntvezes2);
                    System.out.printf("3x de %.2f\n", qntvezes3);
                    System.out.print("Parcelar em: ");
                    qntvezes = entrada.nextInt();

                    switch (qntvezes) {
                        case 1:
                            calculodescontoche = (5 * somaprodutos) / 100;
                            desconto = somaprodutos - calculodescontoche;
                            System.out.printf("Total com desconto: %.2f \n", desconto);
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e) {

                            }

                            System.out.println("Obrigado pela preferencia");
                            System.out.println("volte sempre");

                            break;

                        case 2:
                            qntvezes2 = somaprodutos / 2;

                            System.out.printf("2x= %.2f\n", qntvezes2);
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {

                            }
                            System.out.println("Obrigado pela preferencia");
                            System.out.println("volte sempre");
                            break;

                        case 3:
                            qntvezes3 = somaprodutos / 3;
                            System.out.printf("3x= %.2f\n", qntvezes3);
                            
                            // Pausa para exibir obrigado
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {

                            }
                            System.out.println("Obrigado pela preferencia");
                            System.out.println("volte sempre");

                            break;
                    }
                //CARTAO DE CREDITO SEM DESCONTO
                case 3:
                    System.out.println(" Credito");
                    System.out.println("1x de \n " + somaprodutos);
                    System.out.printf("2x de %.2f\n", somaprodutos / 2);
                    System.out.printf("3x de %.2f\n", somaprodutos / 3);
                    System.out.printf("4x de %.2f\n", somaprodutos / 4);
                    System.out.printf("5x de %.2f\n", somaprodutos / 5);
                    System.out.printf("6x de %.2f\n", somaprodutos / 6);
                    System.out.printf("7x de %.2f\n", somaprodutos / 7);
                    System.out.printf("8x de %.2f\n", somaprodutos / 8);
                    System.out.printf("9x de %.2f\n", somaprodutos / 9);
                    System.out.printf("10x de %.2f\n", somaprodutos / 10);

                    System.out.println("Deseja parcelar em: ");
                    parcelas = entrada.nextInt();

                    System.out.println("Compra efetuada com sucesso");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {

                    }
                    System.out.println("Obrigado pela preferencia");
                    System.out.println("volte sempre");
                    break;

            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");

        }

    }

}
