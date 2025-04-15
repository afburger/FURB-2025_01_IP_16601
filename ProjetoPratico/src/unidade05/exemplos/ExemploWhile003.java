package unidade05.exemplos;

import java.util.Scanner;

// condicional, texto vazio
public class ExemploWhile003 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um texto para ser convertido:");

        String texto = teclado.nextLine();

        while (texto.length() != 0 && !texto.isBlank()) {
            System.out.println(texto.toUpperCase());

            System.out.println("Informe um texto para ser convertido:");
            texto = teclado.nextLine();
            
        }
        teclado.close();
        
    }

}
