import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String valor, codigo;
        int  codigoInt;
        double valorDouble;
        DecimalFormat df = new DecimalFormat("#.00");
        DecimalFormat dfUP = new DecimalFormat("#.00");
                        dfUP.setRoundingMode(RoundingMode.UP);
        valor = JOptionPane.showInputDialog(null, "Digite o valor do produto");
        valorDouble = Double.parseDouble(valor);
        codigo = JOptionPane.showInputDialog(null, "Escolha uma Opção de pagamento \n 1, A vista no dinheiro, 10% de desconto \n 2, A vista no cartão de crédito \n 3, 2x no cartão de crédito, sem desconto");
        codigoInt = Integer.parseInt(codigo);
        switch(codigoInt){
            case 1:
                JOptionPane.showMessageDialog(null, "O Valor do produto é:"+ valorDouble + " \n O Valor a Ser pago é: " + (valorDouble * 0.9));  
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "O Valor do produto é:"+ valorDouble + " \n O Valor a Ser pago é: " + (valorDouble * 0.98));  
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "As parcelos terão o valor de :\n 1º Parcela : " + dfUP.format(valorDouble/2) +
                                                     "\n 2º Parcela: " + df.format(valorDouble/2));
        }
    }
}
