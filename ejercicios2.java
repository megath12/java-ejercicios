package practicaJava;

public class Practica2 {
	
	
	//9. Escribir mostrar en pantalla los primeros 100 numeros primos
	
	static void numPrimo(int nf) {
		int c=0,c1=1;
		for(int i=3;i<1000;i++) {
			if(i%2==0||(i%3==0&&i/3!=1)||(i%5==0&&i/5!=1)||(i%7==0&&i/7!=1)) {
			}
			else {
				System.out.println(c1+" - "+i);
				c1++;
			}
			if(c1>nf) {
				break;
			}
		}
	}
	
	
	
	//10. Escribir un programa para sumar 2 numeros sin 
	//    usar operadores aritmeticos
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numPrimo(10);
	}

}



//11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo

//12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10

//13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"

//14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops

//15. Escribir un metodo para encontrar el factorial de un numero sin loops
