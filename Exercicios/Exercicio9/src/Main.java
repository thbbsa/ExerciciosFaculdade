// Exercicio9: Thiago Barbosa De Oliveira
public class Main {
    public static void main(String[] args) {
        // Declaração das notas
        double nota1 = 8.0;
        double nota2 = 7.5;
        double nota3 = 4.5;
        double nota4 = 9.0;

        // Cálculo da média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibição dos resultados
        System.out.println("--- Boletim Escolar ---");
        System.out.printf("Notas: %.1f, %.1f, %.1f, %.1f%n", nota1, nota2, nota3, nota4);
        System.out.printf("Média Final: %.2f%n", media);
        System.out.println("-----------------------");
    }
}