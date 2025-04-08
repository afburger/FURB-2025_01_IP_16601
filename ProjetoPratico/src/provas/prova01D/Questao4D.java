package provas.prova01D;

import java.util.Scanner;

public class Questao4D {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o código de pagamento:");
		teclado.close();

		String codigoPagamento = teclado.next().toUpperCase();
	
		if (codigoPagamento.equals("C")) {
			System.out.println("Cartão de crédito");
		} else {
			if (codigoPagamento.equals("D")) {
				System.out.println("Cartão de débito");
			} else {
				if (codigoPagamento.equals("P")) {
					System.out.println("PIX");
				} else {
					if (codigoPagamento.equals("B")) {
						System.out.println("Boleto");
					} else {
						System.out.println("Entrada incorreta");
					}
				}
			}
		}
    }
}
