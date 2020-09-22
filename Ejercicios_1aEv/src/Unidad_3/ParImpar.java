package Unidad_3;

import java.util.Scanner;

public class ParImpar {
/*
 * Programa que dice si un número introducido por teclado es par o impar
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Número: ");
		int numero = in.nextInt();
		if (numero%2==0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
	}

}
