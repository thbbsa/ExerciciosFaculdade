//Exercicio8: Thiago Barbosa De Oliveira
public class Main {
    public static void main(String[] args) {
        boolean expressao1 = 120 - 30 == Math.pow(3, 30);
        boolean expressao2 = !(((20 % 4) / 2) == 1) || (9 != 9);
        boolean expressao3 = (5 % 2) > 3;

        char a = 'a';
        char A = 'A';

        boolean expressao4 = (a == A);

        System.out.println("Expr1: " + expressao1);
        System.out.println("Expr2: " + expressao2);
        System.out.println("Expr3: " + expressao3);
        System.out.println("Expr4: " + expressao4);
    }
}
