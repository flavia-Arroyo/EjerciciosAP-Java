package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1b {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese el Primer Numero: ");
		int numeros1 = scn.nextInt();
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Ingrese el Primer Numero: ");
		int numeros2 = scn1.nextInt();
		Scanner scn2= new Scanner(System.in);
		System.out.println("Ingrese el Primer Numero: ");
		int numeros3 = scn2.nextInt();
		Scanner scn3= new Scanner(System.in);
		System.out.println("Ingrese 'a' si desea orden ascendente");
	    String orden = scn3.nextLine();
	    
	    System.out.println("los numeros ordenados son: " + Arrays.toString(ordenarVector(numeros1,numeros2,numeros3,orden)));
		
		

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
