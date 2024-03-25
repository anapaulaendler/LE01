public class Exercicio01 {

    public static void executar() {

        /* Escreva um algoritmo que leia um número digitado pelo usuário e mostre 
        a mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número menor ou 
        igual a 10!”, caso este número seja menor ou igual */
    
    int numero = Prompt.lerInteiro("Digite um número: ");

    if (numero > 10) {
        System.out.println("Número maior que 10!");
    } else {
        System.out.println("Número menor ou igual a 10!");
    }

    Prompt.separador();
    
    }

}