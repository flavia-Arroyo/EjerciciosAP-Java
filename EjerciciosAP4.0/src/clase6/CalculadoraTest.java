package clase6;     

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;






class CalculadoraTest {
     //El resultado de multiplicar 80 por 3 da 240

	@Test
	void multiplicarTest() {
		double resultado = Calculadora.multiplicar(80.00, 3.00);
		
		assertEquals(240, resultado);
	}
	@Test
	void sumadividirTest() {
		// El resultado de sumar 150 y 180, dividido por 3, da 110

		double suma = Calculadora.sumar(150.00, 180.00);
		double resultado = Calculadora.dividir(suma, 3);
		
		assertEquals(110, resultado);
	}
	
	@Test
	void restarmultiplicarTest() {
		// El resultado de restar 90 y 50, multiplicado por 15, no da 605

		double resta = Calculadora.restar(90.00, 50.00);
		double resultado = Calculadora.multiplicar(resta, 15);
		
		assertFalse(resultado== 650);
	}
	
	@Test
	void sumarmultiplicarTest() {
		//. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.

		double suma = Calculadora.sumar(70.00, 40.00);
		double resultado = Calculadora.multiplicar(suma, 25);
		
		assertFalse(resultado== 2700);
	}
	
	
	

}
