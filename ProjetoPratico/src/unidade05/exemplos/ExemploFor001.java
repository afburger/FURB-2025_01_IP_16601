package unidade05.exemplos;

import java.util.Scanner;

public class ExemploFor001 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int idx = 1; idx <= 3; idx++) {
            System.out.println("Informe um nome");
            String nome = teclado.nextLine();

            System.out.println("Posição " + idx + " nome: " + nome);
        }
    }
}
