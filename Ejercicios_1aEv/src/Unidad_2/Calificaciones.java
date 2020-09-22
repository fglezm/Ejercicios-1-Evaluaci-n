package Unidad_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {
/*
 * Programa para calcular promedio general en tres materias y el promedio en cada una de ellas. 
 * Los datos de entrada se introducen por teclado y los de salida con una precision de 2 decimales.
 * No utilizar la clase Scanner.
 * Criterios de calificacion:
 * 		Matemáticas: 90% examen, 10% nota media de los trabajos (se piden 3 trabajos).
 * 		Física: 80% examen, 20% nota media de los trabajos (se piden 2 trabajos).
 * 		Química: 85% examen, 15% nota media de los trabajos (se piden 3 trabajos).
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Nota de matemáticas: ");
		float notaExamenM = Float.parseFloat(in.readLine());
		System.out.print("Nota del primer trabajo de matemáticas: ");
		float notaTrabajo1M = Float.parseFloat(in.readLine());
		System.out.print("Nota del segundo trabajo de matemáticas: ");
		float notaTrabajo2M = Float.parseFloat(in.readLine());
		System.out.print("Nota del tercer trabajo de matemáticas: ");
		float notaTrabajo3M = Float.parseFloat(in.readLine());
		float notaMatematicas = notaExamenM * 0.9f + ((notaTrabajo1M + notaTrabajo2M + notaTrabajo3M)/3f) * 0.1f;
		
		System.out.print("Nota de física: ");
		float notaExamenF = Float.parseFloat(in.readLine());
		System.out.print("Nota del primer trabajo de física: ");
		float notaTrabajo1F = Float.parseFloat(in.readLine());
		System.out.print("Nota del segundo trabajo de física: ");
		float notaTrabajo2F = Float.parseFloat(in.readLine());
		float notaFisica = notaExamenF * 0.8f + ((notaTrabajo1F + notaTrabajo2F)/2f) * 0.2f;
		
		System.out.print("Nota de química: ");
		float notaExamenQ = Float.parseFloat(in.readLine());
		System.out.print("Nota del primer trabajo de quimica: ");
		float notaTrabajo1Q = Float.parseFloat(in.readLine());
		System.out.print("Nota del segundo trabajo de quimica: ");
		float notaTrabajo2Q = Float.parseFloat(in.readLine());
		System.out.print("Nota del tercer trabajo de quimica: ");
		float notaTrabajo3Q = Float.parseFloat(in.readLine());
		float notaQuimica = notaExamenQ * 0.85f + ((notaTrabajo1Q + notaTrabajo2Q + notaTrabajo3Q)/3f) * 0.15f;
		
		System.out.printf("Nota de matemáticas: %.2f\n", notaMatematicas);
		System.out.printf("Nota de fisica: %.2f\n", notaFisica);
		System.out.printf("Nota de química: %.2f\n", notaQuimica);
		System.out.printf("Nota media global: %.2f\n", ((notaMatematicas + notaFisica + notaQuimica)/3));
	}

}
