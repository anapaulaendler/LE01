public class ExercicioDois {

    public static void executar() {

        /* Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o
        resultado da sua soma. */

        int a = Prompt.lerInteiro("Digite o primeiro número: ");
        int b = Prompt.lerInteiro("Digite o segundo número: ");

        int c = a + b;

        System.out.println("A soma dos dois é igual a: " + c);
        Prompt.separador();
    }

}