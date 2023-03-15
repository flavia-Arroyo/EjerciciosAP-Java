package clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio3 {

	public static void main(String[] args) {
		String texto = "texto.txt";
		String salida = "textoSalida.txt";
		String operacion= "codificar";
		int desplazamiento= 2;
		String resultado = "";
		
		String resultadoOperacion="la operacion fue exitosa";

		try {
			for(String linea: Files.readAllLines(Paths.get(texto))) {
				if(operacion.equals("codificar")){
					//si es mas de una linea concateno resultado = resultado + codificar
					resultado = resultado + codificar(linea, desplazamiento);
				}
				else if(operacion.equals("decodificar")){
					//si es mas de una linea concateno resultado = resultado + codificar
					resultado = resultado + decodificar(linea, desplazamiento);
				}
						
				
			}
			//agrega en el archivo de salida el resultado 
			Files.writeString(Paths.get(salida), resultado);
			
			
			
			
		} catch (IOException e) {
			resultadoOperacion= "hubo un error en la operacion";
		}
		
		
		//imprime el resultado en consola
		System.out.println(resultadoOperacion);
	}
	
	// codifica la palabra 
		public static String codificar(String palabra,int desplazamiento) {
			String nuevaPal = "";
			boolean codificar= true;
			for (int i = 0; i < palabra.length(); i++) {
				
				char letraCodificada = cambiarLetra(palabra.charAt(i),desplazamiento, codificar);
				nuevaPal = nuevaPal + letraCodificada;
			}		
			return nuevaPal;
		}	
		//decodifica la palabra
		public static String decodificar(String palabra, int desplazamiento) {
			String palDeco = "";
			boolean codificar= false;
	        for (int i = 0; i < palabra.length(); i++) {
				
				char letraDeco = cambiarLetra(palabra.charAt(i),desplazamiento, codificar);
				palDeco = palDeco + letraDeco;
			}	
			return palDeco;
		}	
		//metodo que cambia la letra para codificar o decodificarla
		public static char cambiarLetra(char letra, int desplazar, boolean cod) {
			String abc = "abcdefghijklmnñopqrstuvwxyz ";
			int longitudAbc = abc.length();
			
			
			char letraNueva = 0;
			//recorro el abecedario
			if(cod) {
				for (int i = 0; i <  longitudAbc; i++) {
					//comparo la letra recibida en el abecedario
					// i es la posicion entonces le sumo el desplazamiento y encuentro la letra				
					char abcLetra = abc.charAt(i);
					int nuevoIndice = i + desplazar;
					
					if(letra == abcLetra) {
						
						//PONER CONDICION CAE FUERA DE RANGO	
						 if(nuevoIndice >=  longitudAbc) {
							 letraNueva = abc.charAt(nuevoIndice - longitudAbc);				 
						 }else {
							 letraNueva = abc.charAt(nuevoIndice);
						 }						
					}
				}
				// si es decodificar
			}else {
				
				for (int i = 0; i <  longitudAbc; i++) {
					//comparo la letra recibida en el abecedario
					// i es la posicion entonces le sumo el desplazamiento y encuentro la letra
					
					char abcLetra = abc.charAt(i);
					int nuevoIndice = i - desplazar;
					if(letra == abcLetra) {
						//PONER CONDICION CAE FUERA DE RANGO
						
						 if(nuevoIndice < 0) {
							 letraNueva = abc.charAt(nuevoIndice + longitudAbc);
							 
							 
						 }else {
							 letraNueva = abc.charAt(nuevoIndice);
						 }						
					}
				}
				
			}
			
			
			return letraNueva;	
		
			
		}

}
