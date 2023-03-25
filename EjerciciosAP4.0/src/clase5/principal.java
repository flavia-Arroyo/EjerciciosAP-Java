package clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


public class principal {

	public static void main(String[] args) {
		//ARCHIVO DONDE TENGO LOS DATOS
		String compra = "compras.txt";
		
		try {
			//guardar en una lista 
			List<String> lista = Files.readAllLines(Paths.get(compra));
			
			//crear los productos acceder a las lineas convierto en un arreglo 
			String[] datosproducto1 = lista.get(1).split(" ");
			String[] datosproducto2 = lista.get(2).split(" ");
			String[] datosproducto3 = lista.get(3).split(" ");
			
			//construimos producto 
			Producto producto1 = new Producto(datosproducto1[1], datosproducto1[2], Float.parseFloat(datosproducto1[0]));
			
			Producto producto2 = new Producto(datosproducto2[1], datosproducto2[2], Float.parseFloat(datosproducto2[0]));
			Producto producto3 = new Producto(datosproducto3[1], datosproducto2[2], Float.parseFloat(datosproducto3[0]));
			
			Carrito carrito = new Carrito(producto1, producto2, producto3,LocalDateTime.parse("2023-03-18T12:23:00") );
			
			Persona persona1 = new Persona("flavia", "arroyo", LocalDateTime.parse("1982-03-23T12:23:00"),carrito);
			
			Carrito miCarrito = persona1.getCarrito();
			float resultado = miCarrito.costoFinal();
			
			System.out.println("el costo total del carrito es: " + resultado);
			
			
			
			
		} catch (IOException e) {
			System.out.println("HUBO UN ERROR" + e);
		
		}
		
	

	}

}
