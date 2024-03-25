import java.util.Scanner;   

public class Exercicio13 {
    
    public static void executar() {

        /* Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de 
        operador em outra variável do tipo CARACTERE. Imprima o resultado da operação 
        de A por B se o operador aritmético for válido; caso contrário deve ser impresso uma 
        mensagem de operador não definido. Tratar erro de divisão por zero.  */

        double a = Prompt.lerDecimal("Digite o primeiro número: ");
        Scanner sc = new Scanner(System.in);   
        System.out.print("Digite a operação (+, -, *, /): ");  
        char c = sc.next().charAt(0);  
        double b = Prompt.lerDecimal("Digite o segundo número: ");


        if (c == '+') {
            System.out.println("Resultado: " + (a + b));
        } else if (c == '-') {
            System.out.println("Resultado: " + (a - b));
        } else if (c == '*') {
            System.out.println("Resultado: " + (a * b));
        } else if (c == '/') {
            if (b == 0) {
                System.out.println("Divisão por zero.");
            } else {
                System.out.println("Resultado: " + (a / b));
            }
        }

        sc.close();
        Prompt.separador();
        
    }

}
