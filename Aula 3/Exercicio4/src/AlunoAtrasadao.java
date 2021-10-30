import javax.swing.JOptionPane;

public class AlunoAtrasadao {
    public static void main(String[] args) throws Exception {
        String entradaHora, entradaMinuto;
        int entradaHoraInt, entradaMinutoInt, horarioHora, horarioMinuto, atrasoHora, atrasoMinuto, minutosDeAtraso, xHora, yMinuto;
        horarioHora = 19;
        horarioMinuto = 10;

        entradaHora = JOptionPane.showInputDialog(null, "Digite a Hora que você entrou");
        entradaHoraInt = Integer.parseInt(entradaHora);
        entradaMinuto = JOptionPane.showInputDialog(null, "Digite o Minuto que você entrou");
        entradaMinutoInt = Integer.parseInt(entradaMinuto);

        atrasoHora = entradaHoraInt - horarioHora;
        atrasoMinuto = entradaMinutoInt - horarioMinuto;
        minutosDeAtraso = (atrasoHora*60) + atrasoMinuto;
        xHora = minutosDeAtraso/60;
        yMinuto = minutosDeAtraso%60;

        JOptionPane.showMessageDialog(null, "O aluno está atraso em "+ xHora + " Horas e "+ yMinuto + " Minutos");
    }
}
