package Unidad_4;

import java.util.Scanner;

public class Cadenas3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe una palabra: ");
		String palabra1 = in.nextLine();
		System.out.println();
		System.out.println("Escribe otra palabra: ");
		String palabra2 = in.nextLine();
		int contador = 0;
		for (int x = 0; x < palabra2.length(); x++) {
			if (palabra1.charAt(x)==(palabra2.charAt(x))) {
				contador++;
			}
		}
		System.out.println(contador);
	}

}
//mal