import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n\n\n\n");

        String[] jogos = {"Candy Crush", "Super Mario", "Cut the Rope"}, cupomCod = {"SETEMBROCHOVE", "NAOCHOVENAO", "CHOVEPAKAS"};
        double[] valores = {10.77, 23.65, 21.90};

        // Bloco impressão
        System.out.println("cód" + " \t Nome " + " \t\t valor ");
        System.out.println("-----------------------------------");     
        for (int i = 0; i < valores.length; i++) {
            System.out.println(i+1 + " \t " + jogos[i] + " \t R$ " + valores[i]);           
        }
        System.out.println("-----------------------------------");

        // Bloco entrada
        System.out.print("\nQual jogo deseja comprar?  ");
        Scanner entrada = new Scanner(System.in);
        int codigoJogo = entrada.nextInt();

        // Bloco esolha
        String jogosEscolhido = jogos[codigoJogo-1];
        double valorPagamento = valores[codigoJogo-1];  

        // Bloco desconto
        System.out.print("\n-----------------------------------");
        System.out.print("\nVocê tem cupom de desconto ? sim(1) não(2) : "); 
        int cupom = entrada.nextInt();
        double desconto;
        desconto = 0;

        if (cupom == 1) {
            System.out.print("Digite o cupom : "); 
            String cupomCodEntrada = entrada.next().toUpperCase();

            switch (cupomCodEntrada) {
                case "SETEMBROCHOVE":
                    desconto = 0.2 * valorPagamento; // 10%
                    System.out.println("Parabéns, você ganhou 20% de desconto");
                    break;
                case "NAOCHOVENAO":
                    desconto = 10.00; // 10%
                    System.out.println("Parabéns, você ganhou 10 R$ de desconto");
                    break;
                case "CHOVEPAKAS":
                    desconto = 0.5 *valorPagamento;
                    if(desconto > 40){
                        desconto = 40;
                    }
                break;
                default:
                    System.out.println("Cupom inválido");
                    break;
            }
        } else {
            System.out.print("Compra sem cupom.\n"); 
            desconto = 0;
        }
        System.out.println("Jogo Escolhido: " + jogosEscolhido + "\n Valor total da compra: R$" + (valorPagamento - desconto) );
    }
    }