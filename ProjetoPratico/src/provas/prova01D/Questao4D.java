package provas.prova01D;

import java.util.Scanner;

public class Questao4D {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o código de pagamento:");
		teclado.close();

		String codigoCombustivel = teclado.next().toUpperCase();
	
		if (codigoCombustivel.equals("C")) {
			System.out.println("Cartão de crédito");
		} else {
			if (codigoCombustivel.equals("D")) {
				System.out.println("Cartão de débito");
			} else {
				if (codigoCombustivel.equals("P")) {
					System.out.println("PIX");
				} else {
					if (codigoCombustivel.equals("B")) {
						System.out.println("Boleto");
					} else {
						System.out.println("Entrada incorreta");
					}
				}
			}
		}
    }
}
