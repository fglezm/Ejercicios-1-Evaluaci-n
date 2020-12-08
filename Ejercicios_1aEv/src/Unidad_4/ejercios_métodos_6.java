package Unidad_4;

import java.util.*;

public class ejercios_métodos_6 {

	public static void main(String[] args) {
		int n1,n2,opcion;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
			n1=sc.nextInt();
		System.out.println("Introduce el segundo número: ");
			n2=sc.nextInt();
		do {
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Salir");
			System.out.println("Introduzca la opción deseada: ");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("La suma de "+n1+" y "+n2+" es: "+sumar(n1,n2));
				break;
			case 2:
				System.out.println("La resta de "+n1+" y "+n2+" es: "+restar(n1,n2));
				break;
			case 3:
				System.out.println("La multiplicación de "+n1+" y "+n2+" es: "+multiplicar(n1,n2));
				break;
			case 4:
				System.out.println("La división de "+n1+" y "+n2+" es: "+dividir(n1,n2));
				break;
			case 5:
				System.out.println("Adios");
				break;
			}
		}while (opcion!=5);
			sc.close();
	}

	public static int sumar(int n1, int n2) {
		int suma = n1 + n2;
		return suma;
	}

	public static int restar(int n1, int n2) {
		int suma = n1 - n2;
		return suma;
	}

	public static int multiplicar(int n1, int n2) {
		int suma = n1 * n2;
		return suma;
	}

	public static int dividir(int n1, int n2) {
		int suma = n1 / n2;
		return suma;
	}
}
