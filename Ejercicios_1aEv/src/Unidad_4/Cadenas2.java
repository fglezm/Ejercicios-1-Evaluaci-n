package Unidad_4;

import java.util.Scanner;

public class Cadenas2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String palabra;
		System.out.print("Escribe una palabra: ");
		palabra = in.nextLine();
		int fin = palabra.length() - 1;
		for (int i = fin; i >= 0; i--) {
			System.out.print(palabra.charAt(i));
		}
	}

}
