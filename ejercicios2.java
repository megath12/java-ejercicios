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
	
	    static void sumBit(int a, int b){
	        while (b != 0) {
	            int suma = a ^ b;
	            int carry = (a & b) << 1;
	            a = suma;
	            b = carry;
	        }
	        System.out.println(a);
	    }
	
	    
	  //11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo

	    static void pali(int n){
	    	String m=Integer.toString(n);
	    	char e0=m.charAt(0);
	    	char e1=m.charAt(1);
	    	String res= e0==e1?"Palndromo":"No es Palidromo";
	    	//String ei=Character.toString(e1)+Character.toString(e0);
	    	//String res= m==ei ? "Es palindromo":"No es palindromo";
	    	System.out.println(res);
	    }
	    
	    
	  //13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
	    public static void reme(String palabra) {
	    	String palse = palabra.trim();
	    	System.out.println(palse);
	    	String revstr2 = palabra.replace(" ","");
	    	System.out.println(revstr2);
	    }
	    
	    
	    
	  //14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
	    static void reve(String le) {
	    	StringBuilder rev = new StringBuilder(le);
	    	String revstr = rev.reverse().toString();
	    	System.out.println(revstr);
	    }
	    
	    
	   
	    
	    
	    

	public static void main(String[] args) {

		numPrimo(10);
		sumBit(3,6);
		pali(35);
		pali(33);
		String jh="pero que bendicion";
		reme(jh);
		reve(jh);

	}

}

