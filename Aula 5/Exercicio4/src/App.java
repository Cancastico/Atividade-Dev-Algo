import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String valorCompra, parcelas;
        Double valorCompraDouble;
        int parcelasInt;
        

        parcelas = "";
        

        valorCompra = JOptionPane.showInputDialog(null, "Digite o valor da sua compra");
        valorCompraDouble = Double.parseDouble(valorCompra);


        parcelas = JOptionPane.showInputDialog(null, "Em quantas parcelas você quer pagar,\n 1 , 2 ou 4?");
        parcelasInt = Integer.parseInt(parcelas);

        if(parcelasInt == 1){
            JOptionPane.showMessageDialog(null, "O valor da parcela será de " + valorCompraDouble + "R$");
        }
        else if(parcelasInt == 2){
            JOptionPane.showMessageDialog(null, "O valor da parcela será de " + valorCompraDouble * 1.03 + "R$");
        }
        else if(parcelasInt == 4){
            JOptionPane.showMessageDialog(null, "O valor da parcela será de " + valorCompraDouble * 1.07  + "R$");
        }else{
            JOptionPane.showMessageDialog(null, "Execute o programa novamnete e Digite um numero de parcelas valido");
        }

    }
}
