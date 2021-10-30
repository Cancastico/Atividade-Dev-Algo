import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String valor, codigo;
        int  codigoInt;
        double valorDouble, desconto;
        valor = JOptionPane.showInputDialog(null, "Digite o valor do produto");
        valorDouble = Double.parseDouble(valor);
        codigo = JOptionPane.showInputDialog(null, "Escolha uma Opção de pagamento \n 1, A vista no dinheiro, 10% de desconto \n 2, A vista no cartão de crédito \n 3, 2x no cartão de crédito, sem desconto");
        codigoInt = Integer.parseInt(codigo);
        switch(codigoInt){
            case 1:
                JOptionPane.showMessageDialog(null, "O Valor do produto é:"+ valorDouble + " \n O Valor a Ser pago é: " + (valorDouble * 0.9));  
            break
            case 2:
                JOptionPane.showMessageDialog(null, "O Valor do produto é:"+ valorDouble + " \n O Valor a Ser pago é: " + (valorDouble * 0.98));  
            break
        }
    }
}
