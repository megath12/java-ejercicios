
package ContolDeFlujoo;

import java.util.Scanner;

public class ejercicio11 {
	
	
	
	

	public static void main(String[] args) {
		// calif minima
		final int califMinima=60;
		
		// Crear objeto tipo scanner, llamado entrada 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa los puntos obtenidos");
		
		// asignamos el valor valor ingresado por el scanner, a una vraible
		int caliIngresada = entrada.nextInt();
		
		// condicion
		String calif= caliIngresada>=califMinima ? "Aprobado":"Reprobado";
		System.out.println(calif);

	}

}


