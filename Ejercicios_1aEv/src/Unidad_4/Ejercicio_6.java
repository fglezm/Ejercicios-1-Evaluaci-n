package Unidad_4;

import java.util.*;

public class Ejercicio_6 {

	public static void main(String[] args) {
		int aleatorio;
		int intentos = 0;
		int numero;
		boolean correcto = false;
		aleatorio = numeroAleatorio();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("introduce un número del 1 al 10: ");
			numero = sc.nextInt();
			if (numero < 1 || numero > 10)
				System.out.println("número incorrecto, vuelva a intentarlo: ");
		} while (numero < 1 || numero > 10);

		do {
			if (correcto == false) {
				intentos = intentos++;
				System.out.println("el número es incorrecto");
				System.out.println("introduce un número: ");
				numero = sc.nextInt();
			} else {
				System.out.println("Has acertado");
				System.out.println("el número de fallos ha sido " + intentos);
			}
		} while (correcto == false);
	}

	public static int numeroAleatorio() {
		int aleatorio;
		Random aleatorio1 = new Random();
		aleatorio = aleatorio1.nextInt(10) + 1;
		System.out.println(aleatorio);
		return aleatorio;
	}

	public static boolean comprobar(int aleatorio, int numero) {
		if (aleatorio == numero)
			return true;
		else
			return false;
	}
}
