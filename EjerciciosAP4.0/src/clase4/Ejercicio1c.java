package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1c {

	public static void main(String[] args) {
		//inicializa las variables 
		int n1 = 0;
		int n2 = 0;
		int n3= 0;
		String orden = "";
		
				
		// ver si tiene elementos arg
		if(args.length < 4) {
			// no tiene elementos se pide por consola
			Scanner scn = new Scanner(System.in);
			System.out.println("Ingrese el Primer Numero: ");
			n1 = scn.nextInt();
			Scanner scn1 = new Scanner(System.in);
			System.out.println("Ingrese el Primer Numero: ");
			n2 = scn1.nextInt();
			Scanner scn2= new Scanner(System.in);
			System.out.println("Ingrese el Primer Numero: ");
			n3 = scn2.nextInt();
			Scanner scn3= new Scanner(System.in);
			System.out.println("Ingrese 'a' si desea orden ascendente");
		    orden = scn3.nextLine();
		}
		else {
			// utiliza los calores de arg

			 n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			n3 = Integer.parseInt(args[2]);
			orden = (args[3]);
		}
		
	    System.out.println("los numeros ordenados son: " + Arrays.toString(ordenarVector(n1,n2,n3,orden)));
		
		

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
