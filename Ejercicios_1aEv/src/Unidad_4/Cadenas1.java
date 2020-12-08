package Unidad_4;

import java.util.Scanner;

public class Cadenas1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe una palabra: ");
		String palabra = in.nextLine();
		int contaA = 0;
		int contaE = 0;
		int contaI = 0;
		int contaO = 0;
		int contaU = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == 'a') {
				contaA = contaA++;
			}
			if (palabra.charAt(i) == 'e') {
				contaA = contaE++;
			}
			if (palabra.charAt(i) == 'i') {
				contaA = contaI++;
			}
			if (palabra.charAt(i) == 'o') {
				contaA = contaO++;
			}
			if (palabra.charAt(i) == 'u') {
				contaA = contaU++;
			}
		}
		System.out.println("A: " + contaA);
		System.out.println("E: " + contaE);
		System.out.println("I: " + contaI);
		System.out.println("O: " + contaO);
		System.out.println("U: " + contaU);
	}

}
