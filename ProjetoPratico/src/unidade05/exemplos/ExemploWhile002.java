package unidade05.exemplos;

import java.util.Scanner;
// contador com soma
public class ExemploWhile002 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de vezes que deseja executar:");
        int qtdVezes = teclado.nextInt();

        int contagem = 1;
        while (contagem <= qtdVezes) {
            System.out.println("Valor da contagem:" + contagem);
            //contagem++;
        }

        teclado.close();
    }

}
