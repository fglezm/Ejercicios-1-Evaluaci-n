package Unidad_3;

import java.util.Scanner;

public class Triángulo {
/*
 * Programa que determine si tres números reales que se introducen por teclado pueden ser las longitudes de
 * los lados de un triángulo. Si la respuesta es afirmativa, tendrá que responder a las preguntas siguientes:
 * - ¿Es escaleno?
 * - ¿Es equilátero?
 * - ¿Es isósceles?
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
				System.out.println("Equilátero");
			}
			else {
				if((lado1!=lado2)&&(lado1!=lado3)&&(lado2!=lado3)) {
					System.out.println("Escaleno");
				}
				else {
					System.out.println("Isósceles");
				}
			}
		}
		else {
			System.out.println("no pueden ser");
		}
		
		
	}
		
}
