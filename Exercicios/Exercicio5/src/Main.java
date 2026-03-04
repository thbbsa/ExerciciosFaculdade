import java.util.Scanner;

// Exercicio 5: Thiago Barbosa De Oliveira
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o Primeiro Numero: ");
        int num1 = leitura.nextInt();

        System.out.print("Digite o Segundo Numero: ");
        int num2 = leitura.nextInt();

        System.out.print("Digite o Terceiro Numero: ");
        int num3 = leitura.nextInt();

        System.out.print("Digite o Quarto Numero: ");
        int num4 = leitura.nextInt();

        int soma = num1 + num2 + num3 + num4;

        System.out.printf("SOMA = %d\n", soma);

        leitura.close();
    }
}