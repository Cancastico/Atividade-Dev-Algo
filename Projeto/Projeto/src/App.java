import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
    //    Bloco Gerador
        int[] senhaSistema = new int[4];
        String senhaSistemaString = "";
        int senhaSistemaInt = 0;
        for (int i = 0; i < 4 ; i++) {
            int aleatorio = (int)(Math.round(10 * Math.random()));
            senhaSistema[3-i] = aleatorio;
        }
        //Transformador de array para int para validação
        senhaSistemaString = IntStream.of(senhaSistema).mapToObj(String::valueOf).reduce("", String::concat);
        senhaSistemaInt = Integer.parseInt(senhaSistemaString);

        ///Dependencias codigo de validação e inserção
        int acertou = 0;
        int[] senhaUsuario = new int[4];
        Scanner input = new Scanner(System.in);
    do {
    // Bloco Inserção
        System.out.println("Digite o codigo de 4 digitos");
        String senhaUsuarioString = input.nextLine();
        int senhaUsuarioInt = Integer.parseInt(senhaUsuarioString), transformaIntLoop = senhaUsuarioInt;

        for (int i = 0; i < senhaUsuarioString.length(); i++) {
            senhaUsuario[3-i] = transformaIntLoop % 10;
            transformaIntLoop = (transformaIntLoop - senhaUsuario[3-i])/10;
        }
    // Bloco validação
        if(Arrays.equals(senhaUsuario, senhaSistema)){
            System.out.println("Parabens, você acertou o codigo, a senha é: " + senhaSistema[0]+" " + senhaSistema[1]+" " +senhaSistema[2]+" " +senhaSistema[3]);
            acertou++;
        }else{
            if(senhaSistemaInt > senhaUsuarioInt ){
                System.out.println(senhaUsuarioInt + " é menor que o codigo secreto");
            }else{
                System.out.println(senhaUsuarioInt + " é maior que o codigo secreto");
            }
        }
    } while (acertou == 0);
}
}