package unidade03.exercicios;

import java.util.Scanner;

/**
 * Uma imobiliária vende apenas terrenos retangulares. 
 * Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.
 *
 *		Exemplos de entrada			Exemplos de saída
 *		3   6						18
 *		2 	18						36
 */
public class Uni3Exe01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a medida do lado A do terreno:");
		float ladoA = teclado.nextFloat();

		System.out.println("Digite a medida do lado B do terreno:");
		float ladoB = teclado.nextFloat();

		teclado.close();

		float areaTerreno = ladoA * ladoB;

		System.out.println("Esse terreno possui uma área de: "
		+ areaTerreno + "m2");
	}
}
