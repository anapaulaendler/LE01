public class Exercicio17 {
    public static void executar() {
        /* Elabore um algoritmo que receba três notas de um aluno os pesos referentes a 
        cada nota e retorne a sua média ponderada. Veja o cálculo da média ponderada: 
        Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3 
        peso1 + peso2 + peso3 
        Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2 
        Média ponderada = 8.25  */

        double a = Prompt.lerDecimal("Digite sua primeira nota: ");
        double b = Prompt.lerDecimal("Digite sua segunda nota: ");
        double c = Prompt.lerDecimal("Digite sua terceira nota: ");

        double pa = Prompt.lerDecimal("Digite o peso da primeira nota: ");
        double pb = Prompt.lerDecimal("Digite o peso da segunda nota: ");
        double pc = Prompt.lerDecimal("Digite o peso da terceira nota: ");

        double r1 = (a * pa) + (b * pb) + (c * pc);
        double r = r1 / (pa + pb + pc);

        System.out.printf("Sua nota é de: %.2f\n", r);
        Prompt.separador();

        }
}
