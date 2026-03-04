// Exercicio 4: Thiago Barbosa De Oliveira
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = leitura.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = leitura.nextInt();

        int produto = num1 * num2;

        System.out.printf("PROD = %d\n", produto);

        leitura.close();
    }
}