import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String iES;
        int iE, iN, iC;
        iES = JOptionPane.showInputDialog(null, "Digite o numero.");
        iE = Integer.parseInt(iES);
        iC = 0;
        while(iE != 0){
            iN = iE % 10;
            iE = (iE - iN)/10;
            iC = iC + 1;
            System.out.println(iC + "-     " + iN);
        }
    }
}

// O codigo escreve os numero de forma inversa ao digitado, saindo 456 quando digitado 654
//Respostas
//614
//52825
//939
//2819
//03
