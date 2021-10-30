import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String valorBrinquedo, classificaçao;
        double valorBrinquedoDouble;
        DecimalFormat df = new DecimalFormat("#.00");


        valorBrinquedo = JOptionPane.showInputDialog(null, "Digite o valor atual do brinquedo");
        valorBrinquedoDouble = Double.parseDouble(valorBrinquedo);

        // Reajuste
        if(valorBrinquedoDouble > 100){
            valorBrinquedoDouble = valorBrinquedoDouble * 1.15;
        }else if(valorBrinquedoDouble > 50.01){
            valorBrinquedoDouble = valorBrinquedoDouble * 1.1;
        }else if(valorBrinquedoDouble < 50.01){
            valorBrinquedoDouble = valorBrinquedoDouble * 1.05;
        }
        // Reclassificação
        classificaçao = "";
        if(valorBrinquedoDouble > 200){
            classificaçao = "Muito Caro";
        }else if(valorBrinquedoDouble > 120.01){
            classificaçao = "Caro";
        }else if(valorBrinquedoDouble > 80){
            classificaçao = "Normal";
        }else if(valorBrinquedoDouble < 80){
            classificaçao = "Barato";
        }

        JOptionPane.showMessageDialog(null, "O Valor Atual é o : " + valorBrinquedo + "R$\n" + "o Valor Futuro do Brinquedo será: " + df.format(valorBrinquedoDouble) + " R$\n" + "A nova categoria do brinquedo é " + classificaçao);
    }
}
