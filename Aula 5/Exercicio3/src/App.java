import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int contaminadaStatus, naoContaminadaStatus;

        contaminadaStatus = JOptionPane.showConfirmDialog(null, "A pessoa infectada está de máscara?", " ", JOptionPane.YES_NO_OPTION);
        naoContaminadaStatus = JOptionPane.showConfirmDialog(null, "A pessoa não está de máscara?", " ", JOptionPane.YES_NO_OPTION);

        if(contaminadaStatus == 1){
            if(naoContaminadaStatus == 1){
                JOptionPane.showMessageDialog(null, "Chace de contaminação : Muito Alta");
            };
            if(naoContaminadaStatus == 0){
                JOptionPane.showMessageDialog(null, "Chace de contaminação : Alta");
            };
        }else{
            if(naoContaminadaStatus == 1){
                JOptionPane.showMessageDialog(null, "Chace de contaminação : Média");
            };
            if(naoContaminadaStatus == 0){
                JOptionPane.showMessageDialog(null, "Chace de contaminação : Baixa");

            };
        }



    }
}
