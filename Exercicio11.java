public class Exercicio11 {

    public static void executar() {

        /* Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em ordem crescente. */

        double a = Prompt.lerDecimal("Digite seu primeiro número: ");
        double b = Prompt.lerDecimal("Digite seu segundo número: ");
        double c = Prompt.lerDecimal("Digite seu terceiro número: ");

        if (a == b || a == c || b == c ) {
            System.out.println("Números iguais presentes.");
        } else if (a > b && a > c) {
            if (b > c) {
                System.out.printf("Em ordem crescente: %.2f, %.2f. e %.2f.\n", c, b, a);
            } else {
                System.out.printf("Em ordem crescente: %.2f, %.2f. e %.2f.\n", b, c, a);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.printf("Em ordem crescente: %.2f, %.2f. e %.2f.\n", c, a, b);
            } else {
                System.out.printf("Em ordem crescente: %.2f, %.2f. e %.2f.\n", a, c, b);
            }
        } else {
            if (b > a) {
                System.out.printf("Em ordem crescente: %.2f, %.2f. e %.2f.\n", a, b, c);
            } else {
                System.out.printf("Em ordem crescente: %.2f, %.2f. e %.2f.\n", b, a, c);
            }
        }

        Prompt.separador();
        
        }
    }