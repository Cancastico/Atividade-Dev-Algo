import javax.swing.JOptionPane;

public class DesconTalvez {
    public static void main(String[] args) throws Exception {
        String valorCompraString;
        valorCompraString = JOptionPane.showInputDialog(null, "Digite o Valor da sua compra aqui no concorrente.");
        double valorCompra = Integer.parseInt(valorCompraString);

        String valorDescontoString;
        valorDescontoString = JOptionPane.showInputDialog(null, "Digite o quanto de desconto você deseja pagar?");
        double valorDesconto = Integer.parseInt(valorDescontoString);

        JOptionPane.showMessageDialog(null,
                "O Valor da compra foi de: " + valorCompra + ", \n O valor do desconto foi de: " + valorDesconto
                        + ", \nO valor da a ser pago é de: " + (valorCompra - valorDesconto));
    }
}
