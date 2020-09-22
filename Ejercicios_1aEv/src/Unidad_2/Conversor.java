package Unidad_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Conversor {
/*
 * Programa que convierta euros en dólares. El dato de entrada será un número decimal correspondiente a la 
 * cantidad en euros y el dato de salida será un número decimal que representará la cantidad correspondiente 
 * en dólares con una precisión de 2 decimales. Utilizar la clase BufferedReader para la entrada de datos.
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Conversor Euros/Dólares");
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		System.out.print("Euros: ");
		float euros = Float.parseFloat(in.readLine());
		System.out.print("Tipo de cambio Euros/Dolares: ");
		float tipo = Float.parseFloat(in.readLine());
		System.out.printf("Dolares: %.2f\n", euros*tipo);
	}

}
