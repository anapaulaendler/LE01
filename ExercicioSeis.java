public class ExercicioSeis {

    public static void executar() {

        /* Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
        Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) /  5 */

        double c = Prompt.lerDecimal("Digite a temperatura em Celsius: ");

        double f = (9 * c + 160) / 5;

        System.out.printf("A temperatura %.2f graus Celsius é igual a %.2f graus Fahrenheit.\n", c, f);

        Prompt.separador();
        
    }

}