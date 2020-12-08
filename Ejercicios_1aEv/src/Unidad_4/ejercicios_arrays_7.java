package Unidad_4;

import java.util.Scanner;

public class ejercicios_arrays_7 {

	public static void main(String[] args) {
		String fraseOriginal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la frase a encriptar. (Utilizar minúsculas): ");
		fraseOriginal = sc.nextLine();
		System.out.println("La frase encriptada es: " + encriptar(fraseOriginal));
		sc.close();
	}

	public static String encriptar(String fraseOri) {
		String fraseEncriptada = "";
		for (int i = 0; i < fraseOri.length(); i++) {
			char letra, nuevaLetra;
			letra = fraseOri.charAt(i);
			nuevaLetra = buscarCodigo(letra, i);
			fraseEncriptada = fraseEncriptada + nuevaLetra;
		}
		return fraseEncriptada;

	}

	public static char buscarCodigo(char letra, int i) {
		// letras originales
		char[] abc = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ' };
		// letras codigo
		char[] codigo = { 'n', 'z', 't', 'y', 'l', 'o', 'g', 'c', 'ñ', 'f', 'r', 'u', 's', 'w', 'k', 'v', 'h', 'p', 'a',
				'd', 'b', 'e', 'j', 'm', 'q', 'x', 'i', ' ' };
		boolean encontrado = false;
		int j = 0;
		while (encontrado == false && j < 28) {
			if (letra == abc[j])
				encontrado = true;
			else
				j = j + 1;
		}
		return codigo[j];
	}

}
