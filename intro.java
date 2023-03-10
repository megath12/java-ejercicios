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
		
		
		// Data types
		int myNum = 5;               // Integer (whole number)
		float myFloatNum = 5.99f;    // Floating point number
		char myLetter = 'D';         // Character
		boolean myBool = true;       // Boolean
		String myText = "Hello";     // String
		
		
		int v1=55;
		int v2=10;
		double divi=((double)v1/(double)v2);
		System.out.println(divi);
		
		// Pedir 2 numeros (x), (y)
				// Enteros
		int n1=3, n2=7;
				
				// 1. Convertir a double cada numero
		
		double n3=(double)n1;
		double n4=(double)n2;
		System.out.println(n3 + " - "+ n4);
				// 2. Tomar las variables enteras y convertir a datos binarios.
		String nb1= decimalToBinary(n1);
		String nb2= decimalToBinary(n2);
		System.out.println(nb1+" - "+nb2);
				// 3. Mostrar el numero mayor
		
		System.out.println(n1>n2?n1+" es mayor":n2+" es mayor");
		
				// 4. Obtener el promedio de (x) y (y)

		System.out.println("Promedio: "+(n1+n2)/2);
		
	}

	private static String decimalToBinary(int n1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}