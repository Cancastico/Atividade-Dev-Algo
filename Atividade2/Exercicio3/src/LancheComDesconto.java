import javax.swing.JOptionPane;

public class LancheComDesconto {
    public static void main(String[] args) throws Exception {
        String nome;
        nome = JOptionPane.showInputDialog(null, "Digite o seu nome.");
        double lanche;
        lanche = 37.50;
        double cashBack = 0.08 * 37.50;

        JOptionPane.showMessageDialog(null, "O valor do Lanche é de " + lanche + "\n o Valor pago foi de: " + lanche
                + "\n e o valor devolvido em cashback foi de: " + cashBack + " para a cateira de " + nome);
    }
}
