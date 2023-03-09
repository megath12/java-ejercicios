
package ejerciciosLogicos;

import java.text.MessageFormat;
import java.util.Scanner;

public class Practica {

	public static void main(String[] args) {
		// Creamos nueva instancia del objeto scanner
		Scanner myScanner = new Scanner(System.in);
		
		// Mensaje para que el usuario ingrese sus datos 
		System.out.println("Enter username");
		
		// Gurdamos en una variable string lo que ingreos el usuario en consola
		String username=myScanner.nextLine();
		
		// mensaje con la variable previa de manera concatenada 
		System.out.println("username is: "+username);
		
		// cerrar escaner en consola
		myScanner.close();
		
		// utilizar tipo de datos primitivos para informacion personal no delicada
				// edad
				// fecha nacimiento
				// Inciales
				// Peso / altura / tamaño calzado /
				// Ciudad nacimiento
				// Nacionalidad 
				// Signo zodiacal
				// Signo ascendente
				// Signo lunar
				// Comida fav
				// Lista de comidas fav MAX 3
				// Tipo de personalidad segun MBTI
				// Que nombre de estrella va con uds

		short edad=26;
		String iniciales="CIG";
		float altura = 1.7f;
		String ciudad = "Toluca";
		String nacionalidad = "Mexicana";
		String signoZ="virgo";
		String signoAsc="nose";
		String signoLun="tampoco se";
		String comida="mole";
		String[] comidas= {"haburguesa","tacos","enchiladas"};
		
		// MessageFormt nos permite concatenar por medio de indices diferentes variables
		String msg = MessageFormat.format("Soy {0}\naños: {1}\nnacionalidad: {2}\ncomida: {3}",iniciales,edad,nacionalidad,comida);
		System.out.println(msg);
		
		
		int v1=55;
		int v2=10;
		double divi=((double)v1/(double)v2);
		System.out.println(divi);
		
		// Pedir 2 numeros (x), (y)
				// Enteros
				
				// 1. Convertir a double cada numero
				
				// 2. Tomar las variables enteras y convertir a datos binarios.
				
				// 3. Mostrar el numero mayor
				
				// 4. Obtener el promedio de (x) y (y)

		
		
	}
	
	
	
}
