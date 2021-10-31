import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        long codigo;
        codigo = Math.round(20 * Math.random());
        System.out.println(codigo);

        for (int i = 1; i <= 5; i++) {
            String codigoUsuario;
            int codigoUsuarioInt;
            codigoUsuario = JOptionPane.showInputDialog(null, "Digite o umnumero de 0 a 20 para acertar o codigo");
            codigoUsuarioInt = Integer.parseInt(codigoUsuario);
            if(codigoUsuarioInt == codigo){
                JOptionPane.showMessageDialog(null, "Parabens você acertou o codigo!");
                i= i + 6;
            }else if(5 - i > 0){
                JOptionPane.showMessageDialog(null, "Você ainda tem "+ (5-i) + " tentativas");
            }else if(5 - i == 0){
                JOptionPane.showMessageDialog(null, "Numero de tentativas excedidas");
            }
            
        }
    }
}
