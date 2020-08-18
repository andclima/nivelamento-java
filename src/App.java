import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente uno = new Cliente();
        uno.setId(1L);
        uno.setNome("Teste...");

        
    }

    public static String isNumeroPar(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        }
        return "Ímpar";
    }
}