package clase4;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		//ubicacion clase    C:\Users\LENOVO\Desktop\FLAVIA\Ap- java 2023\EJERCICIOS-REPOSITORIO\EjerciciosAP-Java\EjerciciosAP4.0\src\clase4
		
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		String ascendente = (args[3]);
		System.out.println(Arrays.toString(ordenarVector(n1,n2,n3,ascendente)));

	}
	public static int[] ordenarVector(int num1, int num2, int num3,String ascendente ) {
		int[] vector = new int[] {num1,num2,num3};		
			for (int i = 0; i < vector.length; i++) {
				for (int j = i+1; j < vector.length; j++) {
					if(ascendente.equals("a")) {
						if(vector[i]>vector[j]) {
							int auxiliar = vector[i];
							vector[i] = vector[j];
							vector[j] = auxiliar;					
					    }	
			
		           }else {
		        	   
		        	   if(vector[i]<vector[j]) {
						int auxiliar = vector[i];
						vector[i] = vector[j];
						vector[j] = auxiliar;
						
					}
		
		
	          }
				
			}
			}
			
			return vector;
	}

	

}
