import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int frio, chuva;

        frio = JOptionPane.showConfirmDialog(null, "Está frio?", "", JOptionPane.YES_NO_OPTION);
        chuva = JOptionPane.showConfirmDialog(null, "Está chovendo?", "", JOptionPane.YES_NO_OPTION);

        if(frio == 0 && chuva == 0){
            JOptionPane.showMessageDialog(null, "Saia com o Guarda Chuva, está chovendo e está frio");
        }else{
            if(frio == 0){
                JOptionPane.showMessageDialog(null, "Está frio, saia com o guarda chuva");
            }
            if(chuva == 0){
                JOptionPane.showMessageDialog(null, "Esta chovendo saia de guarda chuva");
            }
            if( frio == 1 && chuva == 1){
                JOptionPane.showMessageDialog(null, "O tempo está Ook, pode sair sem guarda chuva");
            }
        }

        

    }
}
