package Unidad_3;

import java.util.Scanner;

public class Ejercicio_11 {
/*
 * Realizar un programa que una vez introducidos dos n�meros por teclado nos permita realizar cualquier 
 * operaci�n, la cual ser� seleccionada a partir del siguiente men�:
 * 		1.-SUMAR
 * 		2.-RESTAR
 * 		3.-MULTIPLICAR
 * 		4.-DIVIDIR
 * 		Introduce una opci�n:
 * Mostrar el resultado por pantalla de la forma siguiente: A operaci�n B = resultado
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Primer n�mero: ");
		int A = in.nextInt();
		System.out.print("Segundo n�mero: ");
		int B = in.nextInt();
		System.out.println("1.-SUMAR");
		System.out.println("2.-RESTAR");
		System.out.println("3.-MULTIPLICAR");
		System.out.println("4.-DIVIDIR");
		System.out.println("Introduce una opci�n: ");
		int opcion = in.nextInt();
		switch(opcion) {
		case 1:
			int resultado1 = A+B;
			System.out.println(A + " + " + B + " = " + resultado1);
			break;
		case 2:
			int resultado2 = A-B;
			System.out.println(A + " - " + B + " = " + resultado2);
			break;
		case 3:
			int resultado3 = A*B;
			System.out.println(A + " * " + B + " = " + resultado3);
			break;
		case 4:
			int resultado4 = A/B;
			System.out.println(A + " / " + B + " = " + resultado4);
			break;
		}

	}

}
