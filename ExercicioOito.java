public class ExercicioOito {

    public static void executar() {

        /* Escreva um algoritmo que leia um número e mostre uma mensagem caso este
        número seja maior ou igual a 50, outra se ele for menor que 50 */

        int a = Prompt.lerInteiro("Digite seu número: ");

        if (a >= 50) {
            System.out.println("Número maior ou igual a 50!");
        } else {
            System.out.println("Número menor que 50!");
        }

        Prompt.separador();
        
    }
}