public class Exercicio19 {
    public static void executar() {
        /* Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu 
        volume calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2 * altura; 
        Exemplo: raio = 10, altura = 15. Volume = 4710  */

        double raio = Prompt.lerDecimal("Digite o raio: ");
        double altura = Prompt.lerDecimal("Digite a altura: ");

        double volume = 3.14 * raio * raio * altura;
        System.out.printf("O volume é de: %.2f\n", volume);
        
    }
}
