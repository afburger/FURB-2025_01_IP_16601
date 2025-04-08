package provas.prova01D;

import java.util.Scanner;

public class Questao6D {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Informe o nome do médico:");
        // Lê a informação da linha inteira, idiferente se está vazia ou não.
        String medico = teclado.nextLine();

        System.out.println("Informe a especialidade do médico:");
        // Lê a informação da linha inteira, idiferente se está vazia ou não.
        String especialidade = teclado.nextLine();

        teclado.close();

        if (medico.length() == 0 && especialidade.isBlank()) {
            System.out.println("Não é possível informar os dados");
            System.out.println("Vazio");
        } else {
            System.out.println("Médico:" + medico);

            if (especialidade.isBlank()) {
                System.out.println("Especialidade vazio");
            } else {
                System.out.println("Especialidade:" + especialidade);
            }
        }

        System.out.println("FIM");

    }

}
