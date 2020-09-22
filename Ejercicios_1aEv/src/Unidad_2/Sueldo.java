package Unidad_2;

import java.util.Scanner;

public class Sueldo {
/*
 * Programa que calcula el sueldo total de un vendedor que recibe un sueldo base más un 10% extra por comisión 
 * de sus ventas. El programa pedirá por teclado el sueldo base y el importe de las tres ventas que el vendedor 
 * ha realizado. Después de obtener los datos de entrada, mostrará en la pantalla el importe recibido en 
 * concepto de comisiones y el sueldo total.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Sueldo base: ");
		float sueldo = in.nextFloat();
		System.out.print("Importe de la primera venta: ");
		float venta1 = in.nextFloat();
		System.out.print("Importe de la segunda venta: ");
		float venta2 = in.nextFloat();
		System.out.print("Importe de la tercera venta: ");
		float venta3 = in.nextFloat();
		float comision = (venta1 + venta2 + venta3) * 0.1f;
		System.out.printf("Comision por ventas: %.2f\nSueldo total: %.2f\n", comision, sueldo+comision);
	}

}
