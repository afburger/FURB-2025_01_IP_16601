package provas.prova01D;

import java.util.Scanner;

public class Questao5D {
public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os três valores:");
		
		int temperatura1 = teclado.nextInt();
		int temperatura2 = teclado.nextInt();
		int temperatura3 = teclado.nextInt();
		
		// Ordenação valores
		int temperaturaMenor, temperaturaMedia, temperaturaMaior;
		
		if (temperatura1 <= temperatura2 && temperatura1 <= temperatura3) {
			temperaturaMenor = temperatura1;
			if (temperatura2 <= temperatura3) {
				temperaturaMedia = temperatura2;
				temperaturaMaior = temperatura3;
			} else {
				temperaturaMedia = temperatura3;
				temperaturaMaior = temperatura2;
			}
		} else if (temperatura2 <= temperatura1 && temperatura2 <= temperatura3) {
			temperaturaMenor = temperatura2;
			if (temperatura1 <= temperatura3) {
				temperaturaMedia = temperatura1;
				temperaturaMaior = temperatura3;
			} else {
				temperaturaMedia = temperatura3;
				temperaturaMaior = temperatura1;
			}
		} else {
			temperaturaMenor = temperatura3;
			if (temperatura1 <= temperatura2) {
				temperaturaMedia = temperatura1;
				temperaturaMaior = temperatura2;
			} else {
				temperaturaMedia = temperatura2;
				temperaturaMaior = temperatura1;
			}
		}

		System.out.println("Menu:");
		System.out.println("a: Maior temperatura registrada");
		System.out.println("b: Menor temperatura registrada");
		System.out.println("c: Consumos ordenados do menor para o maior");
		System.out.println("d: Média do consumo nos três meses");
		String opcao = teclado.next().toUpperCase();

		switch (opcao) {
			case "A":
				System.out.println("Maior temperatura registrada: " + temperaturaMaior);
				break;
			case "B":
				System.out.println("Menor temperatura registrada: " + temperaturaMenor);
				break;
			case "C":
				System.out.println("Valores ordenados em ordem crescente");
				System.out.println(temperaturaMenor);	
				System.out.println(temperaturaMedia);
				System.out.println(temperaturaMaior);
				break;
			case "D":
				int media = (temperaturaMenor + temperaturaMedia + temperaturaMaior) / 3;
				System.out.println("MMédia das temperaturas: " + media);
				break;
			default:
				System.out.println("Valor inválido");
				break;
		}
		teclado.close();
	}
}
