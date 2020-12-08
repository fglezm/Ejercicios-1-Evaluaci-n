package Unidad_4;

import java.util.Scanner;
import java.util.Random;

public class Dado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Di el número de tiradas: ");
		int n = sc.nextInt();
		Random dado = new Random();
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		int contador5 = 0;
		int contador6 = 0;
		for (int x = 0; x < n; x++) {
			int resultado = dado.nextInt(6) + 1;
			System.out.print(resultado + " ");
			if (resultado == 1) {
				contador1 = contador1++;
			} else if (resultado == 2) {
				contador2 = contador2++;
			} else if (resultado == 3) {
				contador3 = contador3++;
			} else if (resultado == 4) {
				contador4 = contador4++;
			} else if (resultado == 5) {
				contador5 = contador5++;
			}
			contador6 = contador6++;
		}
		System.out.println();
		System.out.println("El 1 salió " + contador1 + " veces");
		System.out.println("El 2 salió " + contador2 + " veces");
		System.out.println("El 3 salió " + contador3 + " veces");
		System.out.println("El 4 salió " + contador4 + " veces");
		System.out.println("El 5 salió " + contador5 + " veces");
		System.out.println("El 6 salió " + contador6 + " veces");
	}

}
