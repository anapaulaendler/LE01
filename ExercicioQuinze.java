import java.lang.Math;

public class ExercicioQuinze {
    public static void executar() {


        /* Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,
        y2), calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é: d = raiz
        (((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03  */


        double x1 = Prompt.lerDecimal("Digite a coordenada X1: ");
        double y1 = Prompt.lerDecimal("Digite a coordenada Y1: ");
        double x2 = Prompt.lerDecimal("Digite a coordenada X2: ");
        double y2 = Prompt.lerDecimal("Digite a coordenada Y2: ");

        double x = x2 - x1;
        double y = y2 - y1;
        double resultado = (x * x) + (y * y);

        System.out.printf("A distância é de: %.2f\n", Math.sqrt(resultado));
        Prompt.separador();
    }
}
