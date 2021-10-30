import javax.swing.JOptionPane;

public class DesconTop {
    public static void main(String[] args) throws Exception {
        String valorCompraString;
        valorCompraString = JOptionPane.showInputDialog(null, "Digite o Valor da sua compra aqui.");

        double valorCompra = Integer.parseInt(valorCompraString);

        double Desc = 0.15 * valorCompra;

        JOptionPane.showMessageDialog(null,
                "O Valor da compra foi de: " + valorCompra + ", \n O valor do desconto foi de: " + Desc
                        + ", \nO valor da a ser pago é de: " + (valorCompra - Desc));

    }
}
