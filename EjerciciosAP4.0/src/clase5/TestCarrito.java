package clase5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class TestCarrito {

	@Test
	void descuentoFijoTest() {
		Producto producto1 = new Producto("mayonesa", "df4565", 5000);
		
		Producto producto2 = new Producto("mortadela", "fes7812", 2000);
		Producto producto3 = new Producto("galletas", "djdj78123", 3000);
		Carrito carrito = new Carrito(producto1, producto2, producto3,LocalDateTime.parse("2023-03-18T12:23:00") );
		Descuento descFijo = new DescuentoFijo(3000);
		float resultado = carrito.costoFinal(descFijo);
		
		assertEquals(resultado, 7000);
		
	}
	
	@Test
	void descuentoPorcTest() {
		Producto producto1 = new Producto("mayonesa", "df4565", 5000);
		
		Producto producto2 = new Producto("mortadela", "fes7812", 2000);
		Producto producto3 = new Producto("galletas", "djdj78123", 3000);
		Carrito carrito = new Carrito(producto1, producto2, producto3,LocalDateTime.parse("2023-03-18T12:23:00") );
		Descuento descPorc = new DescuentoPorcentaje(0.10f);
		float resultado = carrito.costoFinal(descPorc);
		
		assertEquals(resultado, 9000);
		
	}
	
	@Test
	void descuentoPorcTope() {
		Producto producto1 = new Producto("mayonesa", "df4565", 5000);
		
		Producto producto2 = new Producto("mortadela", "fes7812", 2000);
		Producto producto3 = new Producto("galletas", "djdj78123", 3000);
		Carrito carrito = new Carrito(producto1, producto2, producto3,LocalDateTime.parse("2023-03-18T12:23:00") );
		Descuento descTope = new DescuentoPorcentajeConTope(0.30F);
		descTope.setValor(0.20f);
		
		float resultado = carrito.costoFinal(descTope);
		
		assertEquals(resultado, 8000);
		
	}
}
