import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String numero1, numero2, numero3;
        int numero1Int, numero2Int, numero3Int;

        numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
        numero1Int = Integer.parseInt(numero1);
        numero2 = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
        numero2Int = Integer.parseInt(numero2);
        numero3 = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
        numero3Int = Integer.parseInt(numero3);

        if(numero1Int > numero2Int){
            if(numero1Int > numero3Int){
                JOptionPane.showMessageDialog(null, numero1Int + " é o maior numero");
            }else{
                JOptionPane.showMessageDialog(null, numero3Int + " é o maior numero");
            }
        }else{
            if(numero2Int > numero3Int){
                JOptionPane.showMessageDialog(null, numero2Int + " é o maior numero");
            }
            else{
                JOptionPane.showMessageDialog(null, numero3Int + " é o maior numero");
            }
        }
    }
}
