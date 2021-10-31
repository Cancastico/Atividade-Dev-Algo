import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String codigo;
        long codigoInt, senhaInt;
        double senha;

        senha = (1000 * Math.random());
        senhaInt = Math.round(senha);

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    codigo = (Integer.toString(i)+Integer.toString(j)+Integer.toString(k));
                    codigoInt = Integer.parseInt(codigo);
                    System.out.println(codigo);
                    if(codigoInt == senhaInt){
                        JOptionPane.showMessageDialog(null, "Senha Encontrada\n A senha é: " + codigoInt);
                        i = 10;
                        j = 10;
                        k = 10;

                    }
                }
            }
            
        }
    }
}
