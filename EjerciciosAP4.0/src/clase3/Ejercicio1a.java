package clase3;

import java.util.Arrays;

public class Ejercicio1a {

	public static void main(String[] args) {
		
		
		
		int cantidad  = cantidadLetras("establecer", 'e');
		
		System.out.println("la cantidad de letras en la palabra es: "+ cantidad);
		

		
	}
	//metodo para determinar cantidad de letras en palabra
	
	public static int cantidadLetras(String palabra, char letra) {
		int contador = 0;
		for(int i=0; i<= palabra.length()-1; i++ ) {
			if(palabra.charAt(i) == letra) {
				 contador++;
				
			}
			
			 
		 }
		System.out.println("la palabra: " + palabra + "   la letra: " + letra);
		return contador;
		
	}

}
