package clase4;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;



public class Ejercicio2a {
	public static void main(String[] args) {
		String archivo = "C:\\Users\\LENOVO\\Desktop\\FLAVIA\\Ap- java 2023\\EJERCICIOS-REPOSITORIO\\numeros.txt";
		String operacion= "suma";
		
		int resultado = obtenerResultado(archivo, operacion);
		System.out.println("el resultado de la operacion " + operacion + "  es: " + resultado);		
		
	}
	
	public static int obtenerResultado(String archivo, String operacion) {			
		int resultado= 0;	
			try {
				if (operacion.equals("multiplicacion")) {
					resultado = 1;
					for(String linea: Files.readAllLines(Paths.get(archivo))) {
						
						String[] lineaN = linea.split(" ");
						
						for (String string : lineaN) {
							int num = Integer.parseInt(string);
							resultado *= num;	
							
							
						    }
					
				         }	
					}else {
						for(String linea: Files.readAllLines(Paths.get(archivo))) {
							
							String[] lineaN = linea.split(" ");
							
							for (String string : lineaN) {
								int num = Integer.parseInt(string);
								resultado += num;
							}
					}
					}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	
			return resultado;
	}
	




}
