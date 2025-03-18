package unidade04.exemplos;

import java.util.Scanner;

public class ExemploIfComposto {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe uma letra");
        String letra = teclado.next();

        // Transformando em minusculo.
        letra = letra.toLowerCase();

        

        // Exemplo utilizando o operador OU (||)
        if (letra.equals("a") 
                || letra.equals("e") 
                || letra.equals("i")
                || letra.equals("o")
                || letra.equals("u")) {

                    System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        } 

        // Exemplo utilizando o operador E (&&)
        System.out.println("Informe a idade:");
        int idade = teclado.nextInt();

        System.out.println("Informe possui CNH:");
        String possuiCNH = teclado.next().toLowerCase();

        if (idade > 18 && possuiCNH.equals("s")) {
            System.out.println("Já pode dirigir");
        } else {
            System.out.println("Fique longe da direção!");
        }

        // Exemplo usando negação
        System.out.println("Informe a cor da sua casa:");
        String cor = teclado.next().toLowerCase();

        if (!cor.equals("azul")) {
            System.out.println("Pague seu IPTU");
        }

        teclado.close();

    }

}
