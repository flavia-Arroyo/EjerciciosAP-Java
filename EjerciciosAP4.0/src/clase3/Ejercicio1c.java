package clase3;

public class Ejercicio1c {

	public static void main(String[] args) {
		int[] vectorNum = new int[] {22,65,78,13,67,109,33};
		int numX = 42;
		int resultado = 0;
		for (int i = 0; i < vectorNum.length; i++) {
			
			if(vectorNum[i]> numX) {
				resultado = resultado + vectorNum[i];
				
			}
			
			
			
		}
		System.out.println("el Resultado de los numeros mayores a  " + numX + "es: " + resultado);
		
		

	}

}
