import java.util.Scanner;
// Exercicio13: Thiago Barbosa De Oliveira

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = leitura.nextDouble();

        double quadrado = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);
        double raizQuadrada = Math.sqrt(num);
        double potenciaDez = Math.pow(num, 10);

        System.out.println("Número digitado: " + num);
        System.out.println("Quadrado: " + quadrado);
        System.out.println("Cubo: " + cubo);
        System.out.println("Raiz quadrada: " + raizQuadrada);
        System.out.println("Número elevado a 10: " + potenciaDez);

        leitura.close();
    }
}