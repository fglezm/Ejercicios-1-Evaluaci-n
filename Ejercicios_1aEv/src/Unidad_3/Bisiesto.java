package Unidad_3;

import java.util.Scanner;

public class Bisiesto {
/*
 * Programa que utilizando una �nica expresi�n l�gica determine si un a�o es o no bisiesto. El a�o se 
 * introducir� por teclado y el resultado lo mostrar� en pantalla. 
 * Un a�o es bisiesto si es m�ltiplo de 4.
 * Los m�ltiplos de 100 no son bisiestos, salvo si son m�ltiplos de 400.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("A�o: ");
		int a�o = in.nextInt();
		if ((a�o%2==0 && a�o%100!=0)||(a�o%100==0 && a�o%400==0)) {
			System.out.println("Bisiesto");
		}
		else {
			System.out.println("No bisiesto");
		}
	}

}
