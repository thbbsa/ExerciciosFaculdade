import java.util.Scanner;

// Exercicio 6: Thiago Barbosa De Oliveira
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = leitura.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitura.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = leitura.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("MEDIA = %.2f\n", media);

        leitura.close();
    }
}