public class ExercicioTres {

    public static void executar() {

        /* Escreva um algoritmo que leia os valores de dois números inteiros distintos nas
        variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar
        ao usuário que a sequência de números informados é inválida */

        int a = Prompt.lerInteiro("Digite o primeiro número: ");
        int b = Prompt.lerInteiro("Digite o segundo número: ");

        if (a > b) {
            System.out.println("O número " + a + " é o maior!");
        } else if (b > a) {
            System.out.println("O número " + b + " é o maior!");
        } else {
            System.out.println("Sequência inválida!");
        }

        Prompt.separador();
        
    }
}