package provas.prova01C;

import java.util.Scanner;

public class Questao4C {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Informe um esporte:");
        // Lê a informação da linha inteira, idiferente se está vazia ou não.
        String esporte = teclado.nextLine();

        System.out.println("Informe um estilo musical:");
        // Lê a informação da linha inteira, idiferente se está vazia ou não.
        String estilo = teclado.nextLine();

        teclado.close();

        if (esporte.isBlank() && estilo.isBlank()) {
            System.out.println("Não é possível informar os dados");
            System.out.println("Vazio");
        } else {
            System.out.println("Esporte:" + esporte);

            if (estilo.isBlank()) {
                System.out.println("Estilo vazio");
            } else {
                System.out.println("Estilo:" + estilo);
            }
        }

        System.out.println("FIM");

    }

}
