package unidade05.exemplos;

import java.util.Scanner;
// contador
public class ExemploWhile001 {

    public static void main(String[] args) {
        
        int soma1 = 0;
        for (int vz = 1; vz <=5; vz++) {
            soma1 = soma1 + vz;
        }
        System.out.println("VZ:" + soma1);

        // while similar ao for
        int vezes = 1;
        int soma = 0;
        while (vezes <= 5) {
            soma = soma + vezes;
            vezes++;
        }
        System.out.println("Vezes: " + soma);
    }

}
