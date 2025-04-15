package unidade05.exemplos;

import java.util.Scanner;
// menu
public class ExemploDoWhile001 {

    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);
        String opcao = "";
        do {
            System.out.println("Menu:");
            System.out.println("a: Maior consumo registrado");
            System.out.println("b: Menor consumo registrado");
            System.out.println("c: Consumos ordenados do menor para o maior");
            System.out.println("d: Média do consumo nos três meses");
            System.out.println("x: informe X para sair");
            opcao = teclado.next().toUpperCase(); 

            switch (opcao) {
                case "A":
                    System.out.println("Maior consumo registrado: ");
                    break;
                case "B":
                    System.out.println("Menor consumo registrado: ");
                    break;
                case "C":
                    System.out.println("Consumos ordenados do menor para o maior");
                    break;
                case "D":
                    System.out.println("Média do consumo nos três meses: ");
                    break;
                case "X":
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        } while (!opcao.equals("X"));

        teclado.close();
    }
}
