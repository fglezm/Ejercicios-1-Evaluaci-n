package Unidad_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Cronometro {
/*
 * Programa que pide al usuario que introduzca mediante el teclado su nombre y a continuación muestre en la 
 * consola un mensaje que incluya un número real que represente los segundos y milisegundos que ha tardado 
 * en contestar, con un formato de salida que emplee exactamente 3 dígitos en la parte decimal.
 * No utilizar la clase Scanner.
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Dime tu nombre: ");
		long t0 = System.currentTimeMillis();
		String nombre = in.readLine();
		long t1 = System.currentTimeMillis();
		double segundos = (t1-t0)/1000d;
		System.out.printf("Hola %s, has tardado %.3f segundos en decirme tu nombre.\n", nombre, segundos);
		
	}

}
