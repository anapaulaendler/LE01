public class ExercicioVinte {
    public static void executar() {
        /*  Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em 
        uma viagem, utilizando um automóvel que faz 12km por litro e considerando que são 
        fornecidos o tempo em hora e a velocidade média da viagem. */

        double hora = Prompt.lerDecimal("Digite a quantidade de horas de viagem: ");
        double velo = Prompt.lerDecimal("Digite a velocidade média da viagem: ");

        double litro = (velo * hora) / 12;

        System.out.printf("A quantidade de litros necessária é de: %.2f\n", litro);
        Prompt.separador();
        
    }
}
