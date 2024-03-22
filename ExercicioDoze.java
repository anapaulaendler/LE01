public class ExercicioDoze {

    public static void executar() {

        /* Escreva um algoritmo que receba o número do mês e mostre o mês
        correspondente. Valide mês inválido */

        int a = Prompt.lerInteiro("Digite o número do mês: ");

        String[] nome = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        if (a < 1 && a > 12) {
            System.out.println("Número inválido!");
        } else {
            System.out.println(nome[a - 1]);
        }

        Prompt.separador();
        
    }
}