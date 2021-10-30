import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String numero;
        int numeroInt;
        boolean par, impar;
        numero = JOptionPane.showInputDialog(null, "Digite um numero");
        numeroInt = Integer.parseInt(numero);

        if(numeroInt % 2 == 0){
            par = true;
            impar = false;
        }else{
            par = false;
            impar = true;
        }

        JOptionPane.showMessageDialog(null,"Este número é par? " + par + 
                                            "\n Este número é ímpar? " +  impar);



    }
}
