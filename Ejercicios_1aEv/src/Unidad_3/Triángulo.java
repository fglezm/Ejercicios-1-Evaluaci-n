package Unidad_3;

import java.util.Scanner;

public class Tri�ngulo {
/*
 * Programa que determine si tres n�meros reales que se introducen por teclado pueden ser las longitudes de
 * los lados de un tri�ngulo. Si la respuesta es afirmativa, tendr� que responder a las preguntas siguientes:
 * - �Es escaleno?
 * - �Es equil�tero?
 * - �Es is�sceles?
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Lado 1: ");
		int lado1 = in.nextInt();
		System.out.print("Lado 2: ");
		int lado2 = in.nextInt();
		System.out.print("Lado 3: ");
		int lado3 = in.nextInt();
		
		if((lado1+lado2>lado3)&&(lado1+lado2>lado3)&&(lado1+lado2>lado3)) {
			System.out.println("pueden ser");
			if((lado1==lado2)&&(lado1==lado3)) {
				System.out.println("Equil�tero");
			}
			else {
				if((lado1!=lado2)&&(lado1!=lado3)&&(lado2!=lado3)) {
					System.out.println("Escaleno");
				}
				else {
					System.out.println("Is�sceles");
				}
			}
		}
		else {
			System.out.println("no pueden ser");
		}
		
		
	}
		
}
