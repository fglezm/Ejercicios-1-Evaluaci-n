package Unidad_3;

import java.util.Scanner;

public class Bisiesto {
/*
 * Programa que utilizando una única expresión lógica determine si un año es o no bisiesto. El año se 
 * introducirá por teclado y el resultado lo mostrará en pantalla. 
 * Un año es bisiesto si es múltiplo de 4.
 * Los múltiplos de 100 no son bisiestos, salvo si son múltiplos de 400.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Año: ");
		int año = in.nextInt();
		if ((año%2==0 && año%100!=0)||(año%100==0 && año%400==0)) {
			System.out.println("Bisiesto");
		}
		else {
			System.out.println("No bisiesto");
		}
	}

}
