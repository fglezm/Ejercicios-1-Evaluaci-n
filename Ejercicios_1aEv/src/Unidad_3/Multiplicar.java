package Unidad_3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numero = 0;
		int error = 0;
		while ((numero < 1)||(numero>9)) {
		System.out.print("¿Qué tabla quieres repasar (del 1 al 9): ");
		numero = in.nextInt();
		}
		
		for(int contador = 0; contador<10;contador++) {
		System.out.print("¿Cúal es el resultado de " + numero + " por " + contador + ": ");
		int resultado = in.nextInt();
		if (resultado == numero*contador) {
			System.out.println("Correcto");
		}
		else {
			System.out.println("Error, la respuesta correcta es " + numero*contador);
			error++;
		}
		}
		if (error<2) {
			System.out.println("Has aprobado con " + error + " errores");
		}
		else {
		System.out.println("Has suspendido con " + error + " errores");
		}
		
	}

}
