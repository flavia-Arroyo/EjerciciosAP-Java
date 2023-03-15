package clase3;


import java.util.Arrays;

public class Ejercicio1b {

	public static void main(String[] args) {
		String ascendente = "a";
		
		int[] vectorOrdenado = ordenarVector(89,23,78,ascendente);
		System.out.println("El vector ordenado es: ");
		System.out.println(Arrays.toString(vectorOrdenado));

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
	
				
	


	

