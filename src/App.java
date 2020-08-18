import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int valor = scanner.nextInt();
        if (valor % 2 == 0) {
            System.out.println("Parabéns, vc digitou um número par!");
        } else {
            System.out.println("Opa! Vc digitou um número ímpar!");
        }
        scanner.close();
    }

    public static String isNumeroPar(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        }
        return "Ímpar";
    }
}
