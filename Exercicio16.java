public class Exercicio16 {
    public static void executar() {
        /* Elabore um algoritmo que receba três notas de um aluno e retorne a sua média 
        aritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83 */

        double a = Prompt.lerDecimal("Digite a primeira nota: ");
        double b = Prompt.lerDecimal("Digite a segunda nota: ");
        double c = Prompt.lerDecimal("Digite a terceira nota: ");

        double media = (a + b + c) / 3;

        System.out.printf("A média é igual a: %.2f\n", media);
        Prompt.separador();

    }
}
