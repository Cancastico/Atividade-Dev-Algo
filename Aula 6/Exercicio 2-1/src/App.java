import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <4; i++) {
            String codigoUsuario;
            int codigo, codigoUsuarioInt;
            codigo = 1234;
            codigoUsuario = JOptionPane.showInputDialog(null, "Digite a sua senha! ");
            codigoUsuarioInt = Integer.parseInt(codigoUsuario);


            if(codigo == codigoUsuarioInt){
                JOptionPane.showMessageDialog(null, "Usuario Autenticado");
                i = 4; 
            }else if(3 - i > 0){
                JOptionPane.showMessageDialog(null,"Voce ainda tem " + (3 - i) + " tentativas");
            }else if(3 - i <= 0){
                JOptionPane.showMessageDialog(null, "Numero de tentativas excedida");
            }
            
        }
    }
}
