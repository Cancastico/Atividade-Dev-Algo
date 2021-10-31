import javax.swing.JOptionPane;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        String horaString;
        int hora;
        Calendar infoCalendario = Calendar.getInstance();
        hora = infoCalendario.get(Calendar.HOUR_OF_DAY);

        if(0 <= hora && hora < 6){
            JOptionPane.showMessageDialog(null, "Bom Madrugada!");
        }
        if(6<= hora && hora < 12){
            JOptionPane.showMessageDialog(null, "Bom dia!");
        }
        if(12<= hora && hora < 18){
            JOptionPane.showMessageDialog(null, "Boa tarde!");
        }
        if(18 <= hora && hora <24){
            JOptionPane.showMessageDialog(null, "Boa noite!");
        }
        if(24<= hora){
            JOptionPane.showMessageDialog(null, "Digite um horario valido");
        }
    }
}
