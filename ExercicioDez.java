public class ExercicioDez {

    public static void executar() {

        /* Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso
        o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número inválido!” */

        int a = Prompt.lerInteiro("Digite seu número, de um a cinco: ");

        switch (a) {
            case 1 : System.out.println("Um"); break;
            case 2 : System.out.println("Dois"); break;
            case 3 : System.out.println("Tres"); break;
            case 4 : System.out.println("Quatro"); break;
            case 5 : System.out.println("Cinco"); break;
            default : System.out.println("Número inválido!"); break;
        }

        Prompt.separador();

    }
}