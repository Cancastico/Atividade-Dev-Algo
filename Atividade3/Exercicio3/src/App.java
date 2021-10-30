import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String numero1, numero2;
        double numero1Doub, numero2Doub;
        boolean operador;

        numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
        numero1Doub = Double.parseDouble(numero1);

        numero2 = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
        numero2Doub = Double.parseDouble(numero2);

        JOptionPane.showMessageDialog(null, numero1 + "<" + numero2 +  " ? " + (operador = numero1Doub < numero2Doub) + "\n" +
                                            numero1 + ">" + numero2 +  " ? " + (operador = numero1Doub > numero2Doub) + "\n" +
                                            numero1 + "<=" + numero2 + " ? " + (operador = numero1Doub <= numero2Doub) + "\n" +
                                            numero1 + ">=" + numero2 + " ? " + (operador = numero1Doub >= numero2Doub)
        );
    }
}
