package unidade05.exemplos;

import java.util.Scanner;

public class ExemploFor002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de vezes que deseja executar:");
        int execucoes = teclado.nextInt();

        int soma = 0;
        for (int idx = 1; idx <= execucoes; idx++) {
            System.out.println("Informe um valor " + idx + " a ser somado:");
            int valor = teclado.nextInt();
            soma += valor; 
        }

        teclado.close();

        System.out.println("Resultado da soma:" + soma);
    }
}
