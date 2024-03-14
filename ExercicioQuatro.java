public class ExercicioQuatro {

    public static void executar() {

        /* Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração, 
        multiplicação e a divisão dos números lidos */

        int a = Prompt.lerInteiro("Digite o primeiro número: ");
        int b = Prompt.lerInteiro("Digite o segundo número: ");

         if (b == 0) {
            System.out.println("Divisão inválida!");
         } else {
            System.out.printf("Soma: %d\nSubtração: %d\nMultiplicação: %d\nDivisão: %d\n", (a + b), (a - b), (a * b), (a / b));
         }

         Prompt.separador();
         
    } 
}