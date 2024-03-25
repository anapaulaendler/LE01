public class Exercicio18 {
    public static void executar() {
        /* Elabore um algoritmo que receba três notas de um aluno e retorne a sua média harmônica.  
        3 Média harmônica = 1 + 1 + 1 nota1 nota2 
        Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8 
        Média: 7.37 */

        double a = Prompt.lerDecimal("Digite sua primeira nota: ");
        double b = Prompt.lerDecimal("Digite sua segunda nota: ");
        double c = Prompt.lerDecimal("Digite sua terceira nota: ");

        double a1 = 1 / a;
        double b1 = 1 / b;
        double c1 = 1 / c;

        double media = 3 / (a1 + b1 + c1);

        System.out.printf("A média harmônica é de: %.2f\n", media);
        Prompt.separador();

    }
}
