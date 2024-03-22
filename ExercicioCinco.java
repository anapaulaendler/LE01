public class ExercicioCinco {

    public static void executar() {

        /* Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor
        da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o
        valor da variável A. Apresentar uma mensagem com o valor original de cada variável
        e outra com os valores trocados */

        int a = Prompt.lerInteiro("Digite o primeiro número: ");
        int b = Prompt.lerInteiro("Digite o segundo número: ");

        int c = a;
        int d = b;

        a = b;
        b = c;

        System.out.println("O valor de A atualmente é: " + a + ". Enquanto o de B é igual a: " + b + ".\nOs valores originais de A e B eram, respectivamente: " + c + " e " + d + ".");

        Prompt.separador();
        
    }
}