import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String numero1, numero2;
        int numero1Int, numero2Int;

        numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
        numero1Int = Integer.parseInt(numero1);
        numero2 = JOptionPane.showInputDialog(null, "Digite o segundo numero ");
        numero2Int = Integer.parseInt(numero2);

        if(numero1Int > numero2Int ){
            JOptionPane.showMessageDialog(null, "O numero " + numero1Int + " é maior");
        }else if(numero1Int < numero2Int ){
            JOptionPane.showMessageDialog(null, "O numero " + numero2Int + " é maior");
        }else{
            JOptionPane.showMessageDialog(null, "Os numeros são iguais");
        }
    }
}
