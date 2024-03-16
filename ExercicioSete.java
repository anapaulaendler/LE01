public class ExercicioSete {

    public static void executar() {

        /* Escreva um algoritmo que leia um número e diga, através de uma mensagem, se
        este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo
        o usuário também deverá ser informado. */

        int a = Prompt.lerInteiro("Digite seu número: ");

        if (a >= 100 && a <= 200) {

            System.out.println("O número " + a + " está dentro do intervalo [100, 200].");

        } else {

            System.out.println("O número " + a + " está fora do intervalo [100, 200].");

        }

        Prompt.separador();
        
    }
}