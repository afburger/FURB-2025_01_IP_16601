package unidade05.exemplos;

import java.util.Scanner;

public class ExemploFor003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um palindromo:");
        String mensagem = teclado.nextLine();
        teclado.close();
        
        String mensagemInvertida = "";

        for (int idx = mensagem.length() - 1; idx >= 0; idx--) {
            //System.out.println(mensagem.charAt(idx));
            mensagemInvertida += mensagem.charAt(idx);
        }
        System.out.println(mensagemInvertida);
    }
}
