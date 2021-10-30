import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String numero1 , numero2, operador, nomeOperador;
        double numero1Doub, numero2Doub , resultado;
        nomeOperador = "";
        resultado = 0;
        numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
        numero1Doub = Double.parseDouble(numero1);

        numero2 = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
        numero2Doub = Double.parseDouble(numero2);

        operador = JOptionPane.showInputDialog(null, "Digite Qual Operador querer utilizar(+ , - , / , *)");

        switch (operador) {
            case "+":
                resultado = numero1Doub + numero2Doub;
                nomeOperador = "soma";
                break;
            case "-":
                resultado = numero1Doub - numero2Doub;
                nomeOperador = "subtração";
                break;
            case "/":
                resultado = numero1Doub / numero2Doub;
                nomeOperador = "divisão";
                break;
            case "*":
                resultado = numero1Doub * numero2Doub;
                nomeOperador = "Multiplicação";
            default:
                break;
        }
        JOptionPane.showMessageDialog(null, "A "+ nomeOperador + " dos numeros "+ numero1Doub + "e numero " + numero2Doub + "deu o resultado de " + resultado );

    }
}
