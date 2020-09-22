package Unidad_3;

import java.util.Scanner;

public class Hora {
/*
 * Programa que lea una hora(horas, minutos y segundos) desde el teclado y muestre en la pantalla la hora
 * correspondiente al segundo siguiente
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Hora: ");
		int hora = in.nextInt();
		System.out.print("Minutos: ");
		int minutos = in.nextInt();
		System.out.print("Segundos: ");
		int segundos = in.nextInt();
		segundos++;
		if(segundos>59) {
			segundos = 0;
			minutos++;
			if(minutos>59) {
				minutos = 0;
				hora++;
				if(hora>23) {
					hora = 0;
				}
			}
		}
		System.out.println(hora + ":" + minutos + ":" + segundos);

	}

}
