package unidade03.exemplos;

import java.util.Scanner;

public class CalculoRetangulo {

    /**
     * Incializa o sistema.
     * @param args - Parâmetros para iniciar o sistema.
     */
    public static void main(String[] args) {
        
        
        /**
         * Exemplo de comentário, utilizado para documentar 
         * um bloco de código.
         */

        // criar o objeto de leitura dos dados​
        Scanner teclado = new Scanner(System.in);
        // ler dados e enviá-los ao objeto sala​
        System.out.println("Digite o comprimento");
        double comprimento = teclado.nextDouble();
        System.out.println("Digite a largura");
        double largura = teclado.nextDouble();
        // calcular e informar a área​
        double area = largura * comprimento;
        // escrever o resultado​
        System.out.println("Área=" + area);
        teclado.close();
    }
}
