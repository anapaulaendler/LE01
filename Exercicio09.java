public class Exercicio09 {

    public static void executar() {

        /* Leia dois números nas variáveis A e B e identifique se os valores são iguais ou
        diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais. 
        Caso sejam diferentes, informe que são diferentes e qual número é o maior. */

        double a = Prompt.lerDecimal("Digite o primeiro número: ");
        double b = Prompt.lerDecimal("Digite o segundo número: ");

        if (a == b) {
            System.out.println("Os dois números são iguais!");
        } else {
            if (a > b) {
                System.out.printf("Os dois números são diferentes, sendo %.2f o maior.\n", a);
            } else if (b > a) {
                System.out.printf("Os dois números são diferentes, sendo %.2f o maior.\n", b);
            }
        }

        Prompt.separador();
        
    }
}