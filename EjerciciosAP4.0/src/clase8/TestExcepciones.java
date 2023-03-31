package clase8;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestExcepciones {
	private Carrito carrito;
	private Persona persona;
	
	
	void setup(String ruta) {
		String compra = ruta;
		List<String> lista = new ArrayList<String>();
		Carrito carrito = new Carrito(LocalDateTime.parse("1982-03-23T12:23:00"));
		persona = new Persona("flavia", "arroyo", LocalDateTime.parse("1982-03-23T12:23:00"),carrito);
		this.carrito = persona.getCarrito();
		
		try {
			
				
			//guardar en una lista 
			lista = Files.readAllLines(Paths.get(compra));
			lista.remove(0); //elimina la primera linea
			//crear los productos acceder a las lineas convierto en un arreglo 
			for(String linea: lista) {
				String[] datosDeProducto = linea.split(" ");
				Producto p = new Producto(datosDeProducto[1], datosDeProducto[2], Float.parseFloat(datosDeProducto[0]));
				this.carrito.agregarProducucto(p);
			}		
			
		} catch (IOException e) {
			System.out.println("HUBO UN ERROR" + e);
		
		}
		
		
	}

	@Test
	void testValorCero() {
		setup("comprasTotalCero.txt");
		Descuento desFijo = new DescuentoFijo(300);
		Assertions.assertThrows(ValorCeroException.class, ()->{
			this.carrito.costoFinal(desFijo);
		});
		
	}
	
	@Test
	void testNegativo() {
		setup("comprasResultadoNegativo.txt");
		Descuento desFijo = new DescuentoFijo(300);
		Assertions.assertThrows(TotalNegativoException.class, ()->{
			this.carrito.costoFinal(desFijo);
		
	});

	}
	
}
