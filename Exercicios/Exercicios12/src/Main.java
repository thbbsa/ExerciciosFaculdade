// Exercicio12: Thiago Barbosa De Oliveira

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = leitura.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = leitura.nextInt();

        int idade = anoAtual - anoNascimento;
        int idadeFuturo = 2030 - anoNascimento;

        System.out.println("Sua idade atual é: " + idade + " anos.");
        System.out.println("Sua idade em 2030 será: " + idadeFuturo + " anos.");

        leitura.close();
    }
}