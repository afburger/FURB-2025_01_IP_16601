package provas.prova01C;

import java.util.Scanner;

public class Questao5C {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o código de um combustível:");
		teclado.close();

		String codigoCombustivel = teclado.next().toUpperCase();
	
		if (codigoCombustivel.equals("G")) {
			System.out.println("Gasolina");
		} else {
			if (codigoCombustivel.equals("E")) {
				System.out.println("Etanol");
			} else {
				if (codigoCombustivel.equals("D")) {
					System.out.println("Diesel");
				} else {
					System.out.println("Entrada incorreta");
				}
			}
		}
    }
}
