package practicaJava;

import java.time.LocalTime;

public class Practica1 {
	
	private static final int String = 0;


	static void primerMetodo(int x) {
		System.out.println(x);
	}

	static void segundoMetodo(String w) {
		System.out.println(w);
	}
	
	//1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
	// Revisar si es un triángulo válido
		
	static void uno(int co, int ca) {
		int area=(co*ca)/2;
		System.out.println("El area del triangulo es: "+area);
	}
	
	// 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
	// Utilizar PI de la libreria de Java
	
	static void circArea(float r) {
		float circ=(float) (2*r*Math.PI);
		float area=(float) (Math.pow(r,2)*Math.PI);
		System.out.println("area: "+area+" circunferencia: "+circ);
	}
	
	
	// 3 Escribir un metodo que muestre por consola la hora del sistema
	// Utilizar e investigar la libreria de Java
	
	static void horaActual() {
		LocalTime horaAct=LocalTime.now();
		System.out.println("La hora es: "+horaAct);
	}
	
	

	// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
	// ej 3600 = "1 hora = 60 min = 3600 seg"
	
	
	static void convTiempo(int n) {
		double min=n/60;
		double hora=min/60;
		System.out.println("segs: "+n+" mins: "+min+" horas:"+hora);
	}
	
	
	// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio

	static void volCir(float r) {
		float vol=(float) ((4/3)*Math.PI*Math.pow(r, 3));
		System.out.println("Volumen esfera "+vol);
	}
	
	
	// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura

	
	static void volCono(float r, float h) {
		float vol1=(float)((Math.PI*Math.pow(r,2)*h)/3);
		System.out.println("Volumen de cono: "+vol1);
	}
	
	
	// 7 Encontrar el area superficial de un cubo dado un lado a
	static void arCubo(double a) {
		double area=6*Math.pow(a,2);
		System.out.println("Area sup. cubo "+area);
	}
	
	
	// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
	static void bisie(int a) {
		String amho = a%4==0&&(a%100!=0||a%400==0) ? "Es bisiesto":"No es bsisesto";
		System.out.println(amho);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primerMetodo(12);
		segundoMetodo("Buenas buenas");
		uno(3,5);
		circArea(5);
		horaActual();
		convTiempo(4000);
		volCir(8);
		volCono(4.5f,15.0f);
		arCubo(15.2);
		bisie(2024);
	}


	

}  // cierra

