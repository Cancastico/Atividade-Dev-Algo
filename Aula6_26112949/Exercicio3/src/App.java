public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            Long numero;
            numero = Math.round(100 * Math.random());
            System.out.println(numero);
        }
    }
}
