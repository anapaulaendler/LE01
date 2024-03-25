public class Exercicio11 {

    public static void executar() {

        /* Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em ordem crescente. */

        int a = Prompt.lerInteiro("Digite seu primeiro número: ");
        int b = Prompt.lerInteiro("Digite seu segundo número: ");
        int c = Prompt.lerInteiro("Digite seu terceiro número: ");

        if (a == b || a == c || b == c ) {
            System.out.println("Números iguais presentes.");
        } else if (a > b && a > c) {
            if (b > c) {
                System.out.printf("Em ordem crescente: %d, %d. e %d.\n", c, b, a);
            } else {
                System.out.printf("Em ordem crescente: %d, %d. e %d.\n", b, c, a);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.printf("Em ordem crescente: %d, %d. e %d.\n", c, a, b);
            } else {
                System.out.printf("Em ordem crescente: %d, %d. e %d.\n", a, c, b);
            }
        } else {
            if (b > a) {
                System.out.printf("Em ordem crescente: %d, %d. e %d.\n", a, b, c);
            } else {
                System.out.printf("Em ordem crescente: %d, %d. e %d.\n", b, a, c);
            }
        }

        Prompt.separador();
        
        }
    }