package provas.prova01C;

import java.util.Scanner;

public class Questao6C {
public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os três valores:");
		
		int consumoMes1 = teclado.nextInt();
		int consumoMes2 = teclado.nextInt();
		int consumoMes3 = teclado.nextInt();
		
		// Ordenação valores
		int consumoMenor, consumoMedio, consumoMaior;
		
		if (consumoMes1 <= consumoMes2 && consumoMes1 <= consumoMes3) {
			consumoMenor = consumoMes1;
			if (consumoMes2 <= consumoMes3) {
				consumoMedio = consumoMes2;
				consumoMaior = consumoMes3;
			} else {
				consumoMedio = consumoMes3;
				consumoMaior = consumoMes2;
			}
		} else if (consumoMes2 <= consumoMes1 && consumoMes2 <= consumoMes3) {
			consumoMenor = consumoMes2;
			if (consumoMes1 <= consumoMes3) {
				consumoMedio = consumoMes1;
				consumoMaior = consumoMes3;
			} else {
				consumoMedio = consumoMes3;
				consumoMaior = consumoMes1;
			}
		} else {
			consumoMenor = consumoMes3;
			if (consumoMes1 <= consumoMes2) {
				consumoMedio = consumoMes1;
				consumoMaior = consumoMes2;
			} else {
				consumoMedio = consumoMes2;
				consumoMaior = consumoMes1;
			}
		}

		System.out.println("Menu:");
		System.out.println("a: Maior consumo registrado");
		System.out.println("b: Menor consumo registrado");
		System.out.println("c: Consumos ordenados do menor para o maior");
		System.out.println("d: Média do consumo nos três meses");
		String opcao = teclado.next().toUpperCase();

		switch (opcao) {
			case "A":
				System.out.println("Maior consumo registrado: " + consumoMaior);
				break;
			case "B":
				System.out.println("Menor consumo registrado: " + consumoMenor);
				break;
			case "C":
				System.out.println("Consumos ordenados do menor para o maior");
				System.out.println(consumoMenor);	
				System.out.println(consumoMedio);
				System.out.println(consumoMaior);
				break;
			case "D":
				int media = (consumoMenor + consumoMedio + consumoMaior) / 3;
				System.out.println("Média do consumo nos três meses: " + media);
				break;
			default:
				System.out.println("Valor inválido");
				break;
		}
		teclado.close();
	}
}
