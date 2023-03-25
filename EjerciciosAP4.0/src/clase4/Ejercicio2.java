package clase4;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class Ejercicio2 {

	public static void main(String[] args) {
		
			String archivo = args[0];
			String operacion = args[1];
			int acumulador = 0;
			if(operacion.equals("multiplicacion")){
				 acumulador= 1;
			}
			
			try {
			     for(String linea: Files.readAllLines(Paths.get(archivo))) {
			    	 if(operacion.equals("suma")) {
			    		
				    	 acumulador += Integer.parseInt(linea);
				     }if(operacion.equals("multiplicacion")){
				    	 
				    	 acumulador = acumulador * Integer.parseInt(linea);
				    	 
				     }
			    	 
			     }
			     
				
			} catch (IOException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
			System.out.println("El resultado es:" +  acumulador);
			
		

   }
	
}
